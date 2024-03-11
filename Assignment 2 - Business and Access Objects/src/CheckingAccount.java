/*************************************************
 File: CheckingAccount.java
 By: Geoart Corral
 Date:

 Compile: javac CheckingAccount.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class CheckingAccount extends Account {
    CheckingAccount(int accountId, Customer customer) {
        super(accountId, customer);
    }

    CheckingAccount(int accountId, double balance, Customer customer) {
        super(accountId, balance, customer);
    }

}
