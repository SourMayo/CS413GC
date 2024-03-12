/*************************************************
 File: Customer.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac Customer.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.util.PriorityQueue;

public class Customer extends User {
    private String address;
    private PriorityQueue<Account> accounts;


    Customer() {
        // Default
    }

    Customer(String username, String password, String email, int id) {
        super(username, password, email, id);
        this.accounts = new PriorityQueue<>();
    }

    Customer(String username, String password, String email, int id, String firstName, String lastName) {
        super(username, password, email, id, firstName, lastName);
        this.accounts = new PriorityQueue<>();

    }

    Customer(String username, String password, String email, int id, String firstName, String lastName, String address) {
        super(username, password, email, id, firstName, lastName);
        this.address = address;
        this.accounts = new PriorityQueue<>();
    }


    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public PriorityQueue<Account> getAccountPQ() { return accounts; }



    /********************************************
        public void createChecking(int accountId)
        create checking account with no balance
    ********************************************/
    public void createChecking(int accountId) {
        CheckingAccount checkingAccount = new CheckingAccount(accountId, this);
        this.accounts.add(checkingAccount);
    }
    /********************************************
     public void createChecking(int accountId, double balance)
     create checking account with balance
     ********************************************/
    public void createChecking(int accountId, double balance) {
        CheckingAccount checkingAccount = new CheckingAccount(accountId, balance, this);
        this.accounts.add(checkingAccount);
    }

    /********************************************
     public void createSavings(int accountId)
     create savings account with no balance
     ********************************************/
    public void createSavings(int accountId) {
        SavingsAccount savingsAccount = new SavingsAccount(accountId, this);
        this.accounts.add(savingsAccount);
    }
    /********************************************
     public void createSavings(int accountId, double balance) {
     create savings account with balance
     ********************************************/
    public void createSavings(int accountId, double balance) {
        SavingsAccount savingsAccount = new SavingsAccount(accountId, balance, this);
        this.accounts.add(savingsAccount);
    }

    /********************************************
        public void getAccount(int accountId)
        get a specific account given the ID
    ********************************************/
    public Account getAccount(int accountId) {
        for (Account account : this.accounts) {
            if (account.getAccountID() == accountId) {
                return (account);
            }
        }
        return null;
    }
    /********************************************
        public void removeAccount(int accountId)
        remove account given the id
    ********************************************/
    public void removeAccount(int accountId) {
        for (Account account : this.accounts) {
            if (account.getAccountID() == accountId) {
                this.accounts.remove(account);
                break;
            }
        }
    }
}
