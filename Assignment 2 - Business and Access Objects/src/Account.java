/*************************************************
 File: Account.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac Account.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.time.LocalDate;

public class Account implements Comparable<Account> {
    private double balance;
    private Customer customer;
    private int accountId;
    private LocalDate dateCreated;


    Account(int accountId, Customer customer) {
        this.accountId = accountId;
        this.balance = 0;
        this.customer = customer;
        this.dateCreated = LocalDate.now();
    }

    Account(int accountId, double balance, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.customer = customer;
        this.dateCreated = LocalDate.now();
    }


    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    public int getAccountID() { return accountId; }

    public void setAccountID(int accountID) { this.accountId = accountID; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    public LocalDate getDateCreated() { return dateCreated; }

    public void setDateCreated(LocalDate dateCreated) { this.dateCreated = dateCreated; }

    @Override
    public int compareTo(Account other) {
        // Compare dates
        if (this.dateCreated.isBefore(other.getDateCreated())) {
            return -1;
        } else if (this.dateCreated.isAfter(other.getDateCreated())) {
            return 1;
        }

        // If same day, compare balances
        if (this.balance < other.getBalance()) {
            return -1;
        } else if (this.balance > other.getBalance()) {
            return 1;
        }

        return 0;
    }

    // TODO: Close account, backup
}
