/*************************************************
 File: HomePage.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac HomePage.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    private JLabel homePageLabel;
    private JButton addCust;
    private JButton updateCust;
    private JPanel panel;
    private JButton showCust;
    private JButton deleteCust;

    public HomePage() {
        setTitle("Home Page");
        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(10, 1));

        homePageLabel.setText("Customer Management");
        homePageLabel.setFont(new Font("Verdana", Font.BOLD, 25));

        showCust.setText("Show Customers");
        showCust.addActionListener(this);

        addCust.setText("Add Customer");
        addCust.addActionListener(this);

        updateCust.setText("Update Customer");
        updateCust.addActionListener(this);

        deleteCust.setText("Delete Customer");
        deleteCust.addActionListener(this);

        panel.add(homePageLabel);
        panel.add(showCust);
        panel.add(addCust);
        panel.add(updateCust);
        panel.add(deleteCust);



        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateCust) {
            new SelectCustomer(1);
            this.setVisible(true);
        } else if (e.getSource() == addCust) {
            new AddCustomer();
        } else if (e.getSource() == showCust) {
            new SelectCustomer(2);
        } else if (e.getSource() == deleteCust) {
            JOptionPane.showMessageDialog(null, "Functionality to delete customer is WIP");
            this.setVisible(true);
        }
    }
}
