/*************************************************
 File: CustomerDataConnection.java
 By: Geoart Corral
 Date: 3.23.24

 Compile: javac CustomerDataConnection.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author karunmehta
 * Imported from starter code
 */
public class CustomerDataConnection {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/cs413";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "snide-blade-liking";

    // JDBC variables for opening and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries to be used to persist business objects as needed by the DAO
    private static final String INSERT_SQL = "INSERT INTO customer (id, first_name, last_name, email, phone) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_SQL_BYID = "SELECT * FROM customer WHERE id = ?";
    private static final String UPDATE_SQL = "UPDATE customer SET first_name = ?, last_name = ?, email = ?, phone = ? WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM customer WHERE id = ?";

    public CustomerDataConnection()  { }

    public static Connection getDBConnection() throws SQLException {

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return connection;
    }

    public static String getInsert() {

        return INSERT_SQL;
    }

    public static String getUpdate() {

        return UPDATE_SQL;
    }

    public static String getSelect() {

        return SELECT_SQL_BYID;
    }

    public static String getDelete() {

        return DELETE_SQL;
    }

    public static String getURL() {

        return URL;
    }

    public static String getUsername() {

        return USERNAME;
    }

    public static String getPWD() {

        return PASSWORD;
    }

}
