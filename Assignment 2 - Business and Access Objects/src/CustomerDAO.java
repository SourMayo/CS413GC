/*************************************************
 File: CustomerDAO.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac CustomerDAO.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public interface CustomerDAO extends DAOInterface<Teller> {

    public Customer get(int id);

}

