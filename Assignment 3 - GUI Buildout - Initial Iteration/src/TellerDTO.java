/*************************************************
 File: TellerDTO.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac TellerDTO.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.SQLException;

public class TellerDTO {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int id;



    public TellerDTO() {
        // Default constructor
    }

    TellerDTO(String username, String password, String email, int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    TellerDTO(String username, String password, String email, int id, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

}
