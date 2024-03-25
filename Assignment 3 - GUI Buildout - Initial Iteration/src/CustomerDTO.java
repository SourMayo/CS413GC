/*************************************************
 File: CustomerDTO.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac CustomerDTO.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.SQLException;
import java.util.PriorityQueue;

/**
 *
 * @author karunmehta
 * Imported from starter code
 */

public class CustomerDTO {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    static CustomerDAOConcrete ed = new CustomerDAOConcrete();

    public CustomerDTO() {
        // Default constructor

    }

    public CustomerDTO(int empID, String username, String email) {
        this.username = username;
        this.email = email;
        id = empID;
    }

    public CustomerDTO(String username, String email, String ph) {
        this.username = username;
        this.email = email;
        this.phone = ph;
    }

    public CustomerDTO(int id, String firstName, String lastName, String email, String ph) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = ph;
    }

    public CustomerDTO(String firstName, String lastName, String email, String ph) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = ph;
    }

    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String ph) {
        this.phone = ph;
    }

    public int getId() { return id; }

    public void setID(int anID) {
        this.id = anID;
    }

    public static Customer customerByID(int anId) {

        Customer aCustomer = null;

        try {
            aCustomer = ed.get(anId);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
        if(aCustomer != null) System.out.println(aCustomer.toString());

        System.out.println("\nFetched Customer with ID: " + anId + " Customer Details:\n" + aCustomer.toString());
        return aCustomer;

    }

    public static int performUpdate(Customer aCustomer) {

        int updateResult = -1;

        try {
            updateResult = ed.update(aCustomer);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }

        if(updateResult != -1) System.out.println("\nUpdate Successful");
        System.out.println("Customer Details:\n" + aCustomer.toString());
        return updateResult;
    }

    public static int performCreate(Customer aCustomer) {

        int updateResult = -1;



        try {
            updateResult = ed.save(aCustomer);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }

        if(updateResult != -1) System.out.println("\nCustomer Create Successful");
        System.out.println("Customer Details:\n" + aCustomer.toString());
        return updateResult;
    }

}

