/*************************************************
 File: BankDriver.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac BankDriver.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import static java.lang.System.exit;

public class BankDriver {
    public static void main(String[] args) {

        Customer customer1 = new Customer ("Mayo", "123", "test@sfsu.edu", 1);

        // Create customer and account
        System.out.println("Customer User: " + customer1.getUsername());
        System.out.println("Customer Pass (to be encrypted): " + customer1.getPassword());
        System.out.println("Customer Email: " + customer1.getEmail());

        System.out.println("\nCreating checking account with ID 100...");
        customer1.createChecking(100);
        System.out.println("Created!");

        System.out.println("\nRetrieving balance...");
        System.out.println("Balance: " + customer1.getAccount(100).getBalance());


        // Transfer money
        System.out.println("\nTransferring 200.50 into Mayo's account...");
        customer1.getAccount(100).setBalance(200.50);
        System.out.println("Balance of Mayo's account after deposit, before transfer: "
                + customer1.getAccount(100).getBalance());

        Customer customer2 = new Customer ("Luvly", "123", "test2@sfsu.edu", 2);
        customer2.createChecking(101);

        System.out.println("Balance of Luvly's account before transfer: "
                + customer2.getAccount(101).getBalance());

        Transaction transaction = new Transaction(100.50, customer1, 100);
        transaction.transfer(customer2, 101);

        System.out.println("Balance of Luvly's account after transfer: "
                            + customer2.getAccount(101).getBalance());

        System.out.println("Balance of Mayo's account after transfer: "
                + customer1.getAccount(100).getBalance());


        // Remove account
        System.out.println("\nRemoving checking account with ID 100...");
        customer1.removeAccount(100);
        System.out.println("Removed! Checking if account exists...");
        Account account = customer1.getAccount(100);
        if (account == null) {
            System.out.println("Account doesn't exist!");
        }

        exit(0);

    }
}
