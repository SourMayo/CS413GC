/*************************************************
 File: TransactionDTO.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac TransactionDTO.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class TransactionDTO {
    private double balBefore;
    private double balAfter;
    private double amount;
    private String summary;

    private Customer customer;
    private int accountId;

    TransactionDTO() {
        // Default
    }

    TransactionDTO(double amount, Customer customer, int accountId) {
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
}
