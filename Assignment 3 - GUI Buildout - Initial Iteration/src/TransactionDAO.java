/*************************************************
 File: TransactionDAO.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac TransactionDAO.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

public interface TransactionDAO extends DAOInterface<Transaction> {

    public Transaction get(int id);
}
