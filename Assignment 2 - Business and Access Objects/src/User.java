/*************************************************
 File: User.java
 By: Geoart Corral
 Date:

 Compile: javac User.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
    stages.
 *************************************************/

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private char gender;
    private int id;


    User() {
        // Default
    }

    User(String username, String password, String email, int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    User(String username, String password, String email, int id, String firstName, String lastName) {
        this(username, password, email, id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // phone and gender aren't required upon account creation



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

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public char getGender() { return gender; }

    public void setGender(char gender) { this.gender = gender; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
