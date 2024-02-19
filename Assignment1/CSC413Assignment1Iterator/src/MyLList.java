/*************************************************
 File: MyLList.java
 By: Geoart Corral
 Date: [date last revised]
 Compile: [how to compile this program, e.g., gcc p1.c –o p1 –lm]
 Usage: [how to run this program]
 System: [what system(s) the program runs on]
 Description: [short description on what program does, what user
 enters, what result(s) are displayed]
 *************************************************/

import java.util.*;

public class MyLList<E extends Comparable<E>> {
    private Node head;  // Start of the LL
    int listSize = 0;

    public class Node {
        private E data;
        private Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(E newEntry) {
        Node newNode = new Node(newEntry);

        if (head == null) {
            head = newNode;
        } else {
            Node end = head;
            while (end.next != null) {
                end = end.next;
            }
            end.next = newNode;
        }

        // Keep track of size
        listSize++;
        System.out.println("created new node " + newNode);
        System.out.println("list size is also increased " + listSize);
    }

    // FIXME
    public boolean add(int newPosition, E newEntry) {
        Node newNode = new Node(newEntry);

        return false;
    }

    public Comparable getEntry(int givenPosition) {

        return
    }
}
