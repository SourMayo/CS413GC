/*************************************************
 File: SavingsAccount.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac SavingsAccount.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class SavingsAccount extends Account {
    private double apy;

    SavingsAccount(int accountId, Customer customer) {
        super(accountId, customer);
        this.apy = 0.57;
    }

    SavingsAccount(int accountId, double balance, Customer customer) {
        super(accountId, balance, customer);
        this.apy = 0.57;
    }


    public double getApy() { return apy; }

    public void setApy(double apy) { this.apy = apy; }


    /********************************************
        public void addInterest()
        calculate and add interest to balance
    ********************************************/
    public void addInterest() {
        setBalance(this.getBalance() + (this.getBalance() * apy));
    }
}
