/*************************************************
 File: ShowCustomer.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac ShowCustomer.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateCustomer extends JFrame implements ActionListener  {
    private JPanel panel;
    private JTextField custId;
    private JTextField custFirstName;
    private JTextField custLastName;
    private JTextField custEmail;
    private JTextField custPhone;
    private JLabel custIdLabel;
    private JLabel custFirstNameLabel;
    private JLabel custLastNameLabel;
    private JLabel custEmailLabel;
    private JLabel custPhoneLabel;
    private JButton updateButton;
    private Customer aCustomer;


    UpdateCustomer(int id) {
        aCustomer = CustomerDTO.customerByID(id);

        setTitle("Customer Update Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(11, 1));

        custIdLabel.setText("Customer ID: ");
        custFirstNameLabel.setText("Customer First Name: ");
        custLastNameLabel.setText("Customer Last Name: ");
        custEmailLabel.setText("Customer Email: ");
        custPhoneLabel.setText("Customer Phone: ");

        custId.setText(Integer.toString(aCustomer.getId()));
        custFirstName.setText(aCustomer.getFirstName());
        custLastName.setText(aCustomer.getLastName());
        custEmail.setText(aCustomer.getEmail());
        custPhone.setText(aCustomer.getPhone());

        updateButton.setText("Update");
        updateButton.addActionListener(this);

        panel.add(custIdLabel);
        panel.add(custId);
        panel.add(custFirstNameLabel);
        panel.add(custFirstName);
        panel.add(custLastNameLabel);
        panel.add(custLastName);
        panel.add(custEmailLabel);
        panel.add(custEmail);
        panel.add(custPhoneLabel);
        panel.add(custPhone);
        panel.add(updateButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(custId.getText());
        String firstName = custFirstName.getText();
        String lastName = custLastName.getText();
        String email = custEmail.getText();
        String phone = custPhone.getText();

        // Create a Customer object
        Customer aCustomer = new Customer(id, firstName, lastName, email, phone);

        System.out.println("Details of the Customer: " + aCustomer);

        // Update customer
        int createResult = CustomerDTO.performUpdate(aCustomer);
        if(createResult != -1) {

            JOptionPane.showMessageDialog(null, "Customer Update Was Successful");
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateCustomer(1);
    }
}
