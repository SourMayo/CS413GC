/*************************************************
 File: LinkedListWithIterator.java
 By: Geoart Corral - Starter Code -> Karun Mehta, Frank M. Carrano, Timothy M. Henry
 Date: 02.21.24

 Compile: javac LinkedListWithIterator.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program is a custom linked list
 iterator that prints all objects in the list.
 It adapts starter code provided by Karun Mehta.
 *************************************************/

package listtest;

import java.util.*;

public class LinkedListWithIterator<E extends Comparable<? super E>> extends MyLList<E> implements Iterator<E> {

    // The current position of the iterator
    private ListNode nextNode;

    public LinkedListWithIterator(MyLList<E> LL) {
        // Bring in the linked list and assign first node
        super();
        this.nextNode = LL.getFirstNode();
    }

    /********************************************
        hasNext()
        checks if the current node points to another
    ********************************************/
    @Override
    public boolean hasNext() {
        return nextNode != null;
    }

    /********************************************
        next()
        returns the next node
    ********************************************/
    @Override
    public E next() {
        if (hasNext()) {
            // Save data to return, update node before returning
            E data = nextNode.getData();
            nextNode = nextNode.getNextNode();

            return data;
        } else
            throw new NoSuchElementException("Illegal call to next(); " +
                    "iterator beyond end of list.");

    }

}
