/*************************************************
 File: Admin.java
 By: Geoart Corral
 Date:

 Compile: javac Admin.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Admin extends User {

    Admin() {
        // Default
    }

    Admin(String username, String password, String email, int id) {
        super(username, password, email, id);
    }

    Admin(String username, String password, String email, int id, String firstName, String lastName) {
        super(username, password, email, id, firstName, lastName);
    }


}
