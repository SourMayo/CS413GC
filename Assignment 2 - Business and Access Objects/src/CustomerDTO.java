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

import java.util.PriorityQueue;

public class CustomerDTO {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int id;
    private String address;
    private PriorityQueue<Account> accounts;


    CustomerDTO() {
        // Default
    }

    CustomerDTO(String username, String password, String email, int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;

        this.accounts = new PriorityQueue<>();
    }

    CustomerDTO(String username, String password, String email, int id, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.accounts = new PriorityQueue<>();

    }

    CustomerDTO(String username, String password, String email, int id, String firstName, String lastName, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

        this.accounts = new PriorityQueue<>();
    }


    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public PriorityQueue<Account> getAccountPQ() { return accounts; }
}
