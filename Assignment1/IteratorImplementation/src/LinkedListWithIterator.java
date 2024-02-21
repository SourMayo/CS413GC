/*************************************************
 File: LinkedListWithIterator.java
 By: Geoart Corral, Karun Mehta
 Date: 02.21.24

 Compile: javac LinkedListWithIterator.java
 Usage: Run through an IDE
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
//    TODO private ListNode firstNode;
//    TODO private ListNode lastReturnedNode;

    public LinkedListWithIterator(MyLList<E> LL) {
        // Bring in the linked list
        super();
        this.nextNode = LL.getFirstNode();
//        TODO this.firstNode = LL.getFirstNode();
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
            // Save data to return and update node
            E data = nextNode.getData();
//            TODO lastReturnedNode = nextNode;
            nextNode = nextNode.getNextNode();

            return data;
        } else
            throw new NoSuchElementException("Illegal call to next(); " +
                    "iterator beyond end of list.");

    }

}

    /*
    @Override
    public void remove() {
        if (lastReturnedNode == null) {
            throw new IllegalStateException("Illegal to remove(); " +
                    "next() must first be called");
        } else {
            nextNode = firstNode;
            ListNode previousNode = null;
            ListNode tempNode = null;

            while (nextNode != null && nextNode != lastReturnedNode) {
                previousNode = nextNode;
                nextNode = nextNode.getNextNode();
            }

            if (nextNode == lastReturnedNode) {
                if (previousNode == null) {
                    nextNode = firstNode;
                } else {
                    previousNode.setNextNode(nextNode);
                }
                lastReturnedNode = null;

            }

        }

    }
}
*/


