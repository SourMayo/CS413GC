/*************************************************
 File: Teller.java
 By: Geoart Corral
 Date:

 Compile: javac Teller.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public class Teller extends User {

    public Teller() {
        // Default
    }

    Teller(String username, String password, String email, int id) {
        super(username, password, email, id);
    }

    Teller(String username, String password, String email, int id, String firstName, String lastName) {
        super(username, password, email, id, firstName, lastName);
    }



}
