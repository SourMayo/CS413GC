/*************************************************
 File: DTOAndDAODemo.java
 By: Geoart Corral
 Date: 3.23.24

 Compile: javac DTOAndDAODemo.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.Connection;
import java.sql.SQLException;
import org.modelmapper.ModelMapper;

/**
 *
 * @author karunmehta
 * Imported from starter code
 */
public class DTOAndDAODemo {

    /**
     * @param args the command line arguments
     */

    static Connection conn;
    private final static CustomerDAOConcrete ed = new CustomerDAOConcrete();
    static String sampleFirstName = "Louella";
    static String sampleLastName = "Mortel";
    static String sampleEmail = "lmortel@sfsu.edu";
    static String samplePhone = "650-431-6878";


    public static void main(String[] args) {

        Customer cust;
        int updateID = 2;
        int fetchID = 1;

        try {
            conn = CustomerDataConnection.getDBConnection();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

        //Fetch a customer with the given ID
        cust = performFetch(fetchID);

        //Create a customer to update
        cust = new Customer(updateID, sampleFirstName, sampleLastName, sampleEmail, samplePhone);

        performUpdate(cust);

        //disconnect db connection
        try {
            CustomerDAOConcrete.disconnect();
        } catch(SQLException se) {
            System.out.println("Exception trying to close connection. Message: \n" + se.getMessage());
        }

        testModelMapper();

    }

    private static Customer performFetch(int custID) {

        return CustomerDTO.customerByID(custID);

    }

    private static int performUpdate(Customer aCustomer) {

        return CustomerDTO.performUpdate(aCustomer);

    }

    private static void testModelMapper() {

        //create model mapper
        ModelMapper modelMapper = new ModelMapper();

        //Create Data Transfer Object based on Business Object
        CustomerDTO customerDTO = new CustomerDTO(sampleFirstName, sampleLastName, sampleEmail, samplePhone);

        //Create Business Object from the DTO Object
        Customer aCustomer = modelMapper.map(customerDTO, Customer.class);

        System.out.println("\nSuccessfully mapped and unmapped Customer with ID: " + aCustomer.getId() + " with customer Details:\n" + aCustomer.toString());
    }

}

