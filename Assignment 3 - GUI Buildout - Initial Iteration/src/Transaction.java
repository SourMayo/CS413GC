/*************************************************
 File: Transaction.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac Transaction.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Transaction {
    private double balBefore;
    private double balAfter;
    private double amount;
    private String summary;

    private Customer customer;
    private int accountId;

    Transaction() {
        // Default
    }

    Transaction(double amount, Customer customer, int accountId) {
        this.amount = amount;
        this.customer = customer;
        this.accountId = accountId;
        this.balBefore = customer.getAccount(accountId).getBalance();
    }

    public double getBalBefore() { return balBefore; }

    public void setBalBefore(double balBefore) {this.balBefore = balBefore; }

    public double getBalAfter() { return balAfter; }

    public void setBalAfter(double balAfter) { this.balAfter = balAfter; }

    public double getAmount() {return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getSummary() { return summary; }

    public void setSummary(String summary) { this.summary = summary; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    public int getAccountId() { return accountId; }

    public void setAccountId(int accountId) { this.accountId = accountId; }


    /********************************************
        public String deposit() {
        deposit money into account
    ********************************************/
    public String deposit() {
        balAfter = balBefore + amount;
        customer.getAccount(accountId).setBalance(balAfter);

        summary = "You (Account ID-" + accountId + ") deposited $" + amount + "."
                + "\nYour previous balance was $" + balBefore + ".";

        return summary;
    }

    /********************************************
        public String withdraw() {
        withdraw money from account
    ********************************************/
    public String withdraw() {
        balAfter = balBefore - amount;
        customer.getAccount(accountId).setBalance(balAfter);

        summary = "You (Account ID-" + accountId + ") withdrew $" + amount + "."
                + "\nYour previous balance was $" + balBefore + ".";

        return summary;
    }

    /********************************************
        public String transfer(int accountIdTo) {
        transfer money to account from same customer
    ********************************************/
    public String transfer(int accountIdTo) {
        // Set balance of current
        balAfter = balBefore - amount;
        customer.getAccount(accountId).setBalance(balAfter);

        // Set balance of 2nd account
        balAfter = amount + customer.getAccount(accountIdTo).getBalance();
        customer.getAccount(accountIdTo).setBalance(balAfter);

        summary = "You (Account ID-" + accountId + ") transfered $" + amount
                + " to Account ID-" + accountIdTo
                + "\nYour previous balance was $" + balBefore + ".";

        return summary;
    }

    /********************************************
        public String transfer(Customer customer, int accountIdTo) {
        transfer money to account from a different customer
    ********************************************/
    public String transfer(Customer customerTo, int accountIdTo) {
        // Set balance of current
        balAfter = balBefore - amount;
        customer.getAccount(accountId).setBalance(balAfter);

        // Set balance of 2nd account of different customer
        balAfter = amount + customerTo.getAccount(accountIdTo).getBalance();
        customerTo.getAccount(accountIdTo).setBalance(balAfter);

        summary = "You (Account ID-" + accountId + ") transfered $" + amount
                + " to Account ID-" + accountIdTo
                + "\nYour previous balance was $" + balBefore + ".";

        return summary;
    }
}
