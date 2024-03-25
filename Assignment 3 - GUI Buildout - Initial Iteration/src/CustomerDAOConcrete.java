/*************************************************
 File: CustomerDAOConcrete.java
 By: Geoart Corral
 Date: 3.23.24

 Compile: javac CustomerDAOConcrete.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author karunmehta
 * Imported from starter code
 */
class CustomerDAOConcrete implements CustomerDAO {

    static Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    static String url = CustomerDataConnection.getURL();
    static String username = CustomerDataConnection.getURL();
    static String password = CustomerDataConnection.getURL();

    CustomerDAOConcrete() {

        try {

            connection = CustomerDataConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

    }

    // Method to disconnect from the database
    public static void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Method to insert a user into the database
    @Override
    public int insert(Customer cust) throws SQLException {

        int res = -1;
        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setInt(1, cust.getId());
        pStatement.setString(2, cust.getFirstName());
        pStatement.setString(3, cust.getLastName());
        pStatement.setString(4, cust.getEmail());
        pStatement.setString(5, cust.getPhone());

        res = pStatement.executeUpdate();
        disconnect();

        return res;
    }

    // Method to retrieve a user from the database by ID
    @Override
    public Customer get(int anID) throws SQLException {

        pStatement = connection.prepareStatement(CustomerDataConnection.getSelect());
        pStatement.setInt(1,anID);
        result = pStatement.executeQuery();

        Customer updatedEmp = null;
        if (result.next()) {
            Customer e = new Customer();
            updatedEmp = new Customer( result.getInt("id"), result.getString("first_name"), result.getString("last_name"), result.getString("email"), result.getString("phone"));
        }

        return updatedEmp;
    }

    // Method to update a user in the database
    public int update(Customer cust) throws SQLException {

        int result = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getUpdate());
        pStatement.setString(1, cust.getFirstName());
        pStatement.setString(2, cust.getLastName());
        pStatement.setString(3, cust.getEmail());
        pStatement.setString(4, cust.getPhone());
        pStatement.setInt(5, cust.getId());
        result = pStatement.executeUpdate();

        return result;
    }

    // Method to delete a user from the database
    @Override
    public int delete(Customer cust) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getDelete());
        pStatement.setInt(1,cust.getId());
        res = pStatement.executeUpdate();

        return res;
    }

    // Method to update a user in the database
    @Override
    public int save(Customer cust) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setInt(1, cust.getId());
        pStatement.setString(2, cust.getFirstName());
        pStatement.setString(3, cust.getLastName());
        pStatement.setString(4, cust.getEmail());
        pStatement.setString(5, cust.getPhone());
        res = pStatement.executeUpdate();

        return res;
    }

}
