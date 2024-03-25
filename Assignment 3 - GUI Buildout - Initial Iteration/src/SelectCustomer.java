/*************************************************
 File: SelectCustomer.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac SelectCustomer.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCustomer extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField custId;
    private JLabel custIdLabel;
    private JButton submitButton;
    private int mode;

    SelectCustomer(int mode) {
        // Choose selection type
        this.mode = mode;

        setTitle("Customer Select Form");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(3, 1));

        custIdLabel.setText("Customer ID: ");
        submitButton.setText("Submit");

        panel.add(custIdLabel);
        panel.add(custId);
        panel.add(submitButton);
        submitButton.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(custId.getText());
        switch (mode) {
            // Update customer
            case 1:
                new UpdateCustomer(id);
                setVisible(false);
                break;
            // Show customer
            case 2:
                new ShowCustomer(id);
                setVisible(false);
                break;
        }

    }

    public static void main(String[] args) {
        new SelectCustomer(2);
    }
}
