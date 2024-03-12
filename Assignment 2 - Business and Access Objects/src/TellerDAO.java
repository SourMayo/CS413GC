/*************************************************
 File: TellerDao.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac TellerDao.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public interface TellerDAO extends DAOInterface<Teller> {

    public Teller get(int id);

}
