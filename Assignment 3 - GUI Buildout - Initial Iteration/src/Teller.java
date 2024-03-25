/*************************************************
 File: Teller.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac Teller.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Teller extends User {

    public Teller() {
        // Default
    }

    Teller(String username, String password, String email, int id) {
        super(username, password, email, id);
    }

    Teller(String username, String password, String email, int id, String firstName, String lastName) {
        super(username, password, email, id, firstName, lastName);
    }


    // Teller can deal with accounts as well
    /********************************************
     public void createChecking(int accountId, Customer customer)
     create checking account with no balance for customer
     ********************************************/
    public void createChecking(int accountId, Customer customer) {
        CheckingAccount checkingAccount = new CheckingAccount(accountId, customer);
        customer.getAccountPQ().add(checkingAccount);
    }
    /********************************************
     public void createChecking(int accountId, double balance, Customer customer)
     create checking account with balance for customer
     ********************************************/
    public void createChecking(int accountId, double balance, Customer customer) {
        CheckingAccount checkingAccount = new CheckingAccount(accountId, balance, customer);
        customer.getAccountPQ().add(checkingAccount);
    }

    /********************************************
     public void createSavings(int accountId, Customer customer)
     create savings account with no balance for customer
     ********************************************/
    public void createSavings(int accountId, Customer customer) {
        SavingsAccount savingsAccount = new SavingsAccount(accountId, customer);
        customer.getAccountPQ().add(savingsAccount);
    }
    /********************************************
     public void createSavings(int accountId, double balance, Customer customer) {
     create savings account with balance for customer
     ********************************************/
    public void createSavings(int accountId, double balance, Customer customer) {
        SavingsAccount savingsAccount = new SavingsAccount(accountId, balance, customer);
        customer.getAccountPQ().add(savingsAccount);
    }

    /********************************************
        public void getAccount(int accountId, Customer customer)
        get a specific account given the ID and customer
    ********************************************/
    public Account getAccount(int accountId, Customer customer) {
        for (Account account : customer.getAccountPQ()) {
            if (account.getAccountID() == accountId) {
                return (account);
            }
        }
        return null;
    }
    /********************************************
     public void removeAccount(int accountId, Customer customer)
     remove account given the id for customer
     ********************************************/
    public void removeAccount(int accountId, Customer customer) {
        for (Account account : customer.getAccountPQ()) {
            if (account.getAccountID() == accountId) {
                customer.getAccountPQ().remove(account);
                break;
            }
        }
    }

}
