/*************************************************
 File: ListWithIteratorInterface.java
 By: Geoart Corral - Starter Code -> Karun Mehta, Frank M. Carrano, Timothy M. Henry
 Date: 02.21.24

 Compile: javac ListWithIteratorInterface.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program is a custom linked list
 iterator that prints all objects in the list.
 It adapts starter code provided by Karun Mehta.
 *************************************************/

package listtest;

import java.util.Iterator;
/**
   An interface for the ADT list that has an iterator.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface ListWithIteratorInterface<E> extends ListInterface<E>, Iterable<E>
{
   public Iterator<E> getIterator();
} // end ListWithIteratorInterface

