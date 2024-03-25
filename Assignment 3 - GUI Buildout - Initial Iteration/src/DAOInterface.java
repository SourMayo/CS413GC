/*************************************************
 File: DAOInterface.java
 By: Geoart Corral
 Date: 3.12.24

 Compile: javac DAOInterface.java
 Usage: Run through an IDE
 System: All

 Description: This is a bank program in its early
 stages.
 *************************************************/

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author karunmehta
 */
public interface DAOInterface<T> {

    T get(int id) throws SQLException;
    //List<T> getAll() throws SQLException;
    int save(T e) throws SQLException;
    int insert(T e) throws SQLException;
    int update(T e) throws SQLException;
    int delete(T e) throws SQLException;

}
