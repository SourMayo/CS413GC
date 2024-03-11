/*************************************************
 File: Driver.java
 By: Geoart Corral - Starter Code -> Karun Mehta, Frank M. Carrano, Timothy M. Henry
 Date: 02.21.24

 Compile: javac Driver.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program is a custom linked list
    iterator that prints all objects in the list.
    It adapts starter code provided by Karun Mehta.
 *************************************************/

package listtest;

import java.util.*;
/**
   A driver that demonstrates the class LinkedListWithIterator.
   Adapted from starter code provided.
 */
public class Driver  {

    public static void main (String args[]) {

        System.out.println("Create a list: ");

        // Create a linked list of type String
        MyLList<String> myList = new MyLList<>();

        // Add elements to iterate through
        System.out.println("Testing add to end: Add A, B, C, D");
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        System.out.println("\nUsing ADT list operations hasNext and next:");

        // Iterate and display through a method
        displayList(myList);

        // Get an initialized instance of iterator
        Iterator<String> it = myList.getIterator();

        // Manually iterate through linked list
        System.out.println("\nBegin iteration again:");
        it = myList.getIterator();
        System.out.println("next() returns " + it.next() + " (should be A)");
        System.out.println("next() returns " + it.next() + " (should be B)");
        System.out.println("next() returns " + it.next() + " (should be C)");
        System.out.println("next() returns " + it.next() + " (should be D)");

        System.exit(0);
    } // end main

    /********************************************
        displayList(MyLList<String> myLList)
        Prints each element of a linked list on a new line
    ********************************************/
    public static void displayList(MyLList<String> myLList) {

        System.out.println("The list contains " + myLList.getLength() +
                            " string(s) running through iterator, as follows:");

        // Get initialized instance of iterator
        Iterator<String> itr = myLList.getIterator();

        // Iterate through the string and print
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }  // end displayList

}  // end Driver