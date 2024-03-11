/*************************************************
 File: Customer.java
 By: Geoart Corral
 Date:

 Compile: javac Customer.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Customer extends User {
    private String address;

    // A customer can have multiple accounts, so this should later be stored as a list
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;


    Customer() {
        // Default
    }

    Customer(String username, String password, String email, int id) {
        super(username, password, email, id);
    }

    Customer(String username, String password, String email, int id, String firstName, String lastName) {
        super(username, password, email, id, firstName, lastName);
    }

    Customer(String username, String password, String email, int id, String firstName, String lastName, String address) {
        super(username, password, email, id, firstName, lastName);
        this.address = address;
    }


    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public CheckingAccount getCheckingAccount() { return checkingAccount; }

    public void setCheckingAccount(CheckingAccount checkingAccount) { this.checkingAccount = checkingAccount; }

    public SavingsAccount getSavingsAccount() { return savingsAccount; }

    public void setSavingsAccount(SavingsAccount savingsAccount) { this.savingsAccount = savingsAccount; }
}
