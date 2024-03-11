/*************************************************
 File: Account.java
 By: Geoart Corral
 Date:

 Compile: javac Account.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Account {
    private double balance;
    private Customer customer;
    private int accountId;

    Account(int accountId, Customer customer) {
        this.accountId = accountId;
        this.balance = 0;
        this.customer = customer;
    }

    Account(int accountId, double balance, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.customer = customer;
    }


    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    public int getAccountID() { return accountId; }

    public void setAccountID(int accountID) { this.accountId = accountID; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    // TODO: Close account, backup
    // test
}
