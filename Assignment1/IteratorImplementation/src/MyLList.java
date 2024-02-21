/*************************************************
 File: MyLList.java
 By: Geoart Corral, Karun Mehta
 Date: 02.21.24

 Compile: javac MyLList.java
 Usage: Run through an IDE
 System: All

 Description: This program is a custom linked list
 iterator that prints all objects in the list.
 It adapts starter code provided by Karun Mehta.
 *************************************************/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

import java.util.Iterator;

/**
 *
 * @author kmehta
 */
public class MyLList < E extends Comparable < ? super E> > implements ListWithIteratorInterface<E> {
 
    private boolean integrityOK;
    private ListNode firstNode; // reference to first node of the list
    private ListNode lastNode; // reference to last node of the list
    private int numberOfEntries; // number of entries in list
    
    // constructor
    public MyLList() {
        clear ();
    } // end default constructor

    // clear list. Set firstNode to NULL
    public void clear() {
        
        integrityOK = false;
        
        firstNode = null;
        lastNode = null;
        numberOfEntries = 0;
        
        integrityOK = true;
    } // end clear    

    private void checkIntegrity() {
        
        if(!integrityOK)
            throw new SecurityException("Corrupt Linked List.. cannot continue..");
        
    }// end check Integrity
        
    public boolean isEmpty() {

        return (firstNode == null);

    } // end isEmpty
    
    public int getLength() {
        return numberOfEntries;
    }
    
    public boolean contains(E anEntry) {

        checkIntegrity();
        ListNode fn = firstNode;
        
        if(fn == null) return false;
        else if(fn.getData().equals(anEntry)) return true;
        else {
            do {
                fn = fn.next;
                if(anEntry.equals(fn.getData())) return true;
            } while (fn.next != null);
        }
        return false;
    }
    
    /*
    public void printAll() {
        
        E[] arr = this.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public String toArray() {
       
        boolean done = false;
        if(firstNode == null) return null;
        
        String outputStr = "[";

        int count = 0;
        ListNode currentNode = firstNode;
        
        do {
            outputStr += currentNode.getData().toString();
            count++;
            if(currentNode.next == null)
                done = true;
            else currentNode = currentNode.next;
        } while (!done);
        
        return outputStr += "]";
        
    }// end toArray
    
    */

    public void printAll() {

        Comparable[] arr = this.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public Comparable[] toArray() {

        if(firstNode == null) return null;

        E[] arr = (E[])new Comparable[numberOfEntries];

        int count = 0;
        ListNode currentNode = firstNode;

        do {
            arr[count] = currentNode.getData();
            count++;
            if(currentNode.next == null) {
                break;
            }
            currentNode = currentNode.next;
        } while (!(currentNode.equals(lastNode)));

        arr[count] = lastNode.getData();
        return arr;

    }// end toArray

    private ListNode getNodeAt(int givenPosition) {
        
        checkIntegrity();
        // use temporary node currentNode to traverse
        // list starting at firstNode
        ListNode currentNode = firstNode;
        // traverse the list to locate the desired node
        for (int counter = 1 ; counter < givenPosition ; counter++) {
            currentNode = currentNode.next;
        }
        
        // currentList now refers to node at givenPosition
        return currentNode;
    } // end getNodeAt

    public Comparable getEntry(int givenPosition) {
        
        Comparable[] arr = this.toArray();
        
        E element = null;
        if((givenPosition > 0) && (givenPosition < arr.length)) {
            element = (E) arr[givenPosition - 1];
        }

        return element;

    } // end getEntry    
 
    public E replace(int givenPosition, E newEntry) {

        checkIntegrity();
        boolean success = false;
        
        if (!((givenPosition >= 1) && (givenPosition <= numberOfEntries))) {
            return null;
        } else {
        
            ListNode theNode = this.getNodeAt(givenPosition - 1);
            theNode.setData(newEntry);
            success = true;
        }
        
        return newEntry;

    } // end replace    

    public Comparable remove(int position) {

        checkIntegrity();
        
        E result = null; // return value
        
        if ((position >= 1) && (position <= numberOfEntries)) {
            if (position == 1) { // case 1: first node, remove first entry
                result = firstNode.data; // save entry to be removed
                firstNode = firstNode.next;
            } else { // case 2: not first node
                ListNode nodeBefore = getNodeAt(position - 1);
                ListNode nodeToRemove = nodeBefore.next;
                ListNode nodeAfter = nodeToRemove.next;
                nodeBefore.next = nodeAfter; // disconnect the node to be removed
                result = nodeToRemove.getData(); // save entry to be removed
            } // end if
            
            numberOfEntries --;

        } else {
         
            System.out.println(position + ": is out of range of the list with size: " + numberOfEntries);
            
        }// end if

        return result; // return removed entry, or

    } // end remove(int i)

    
    public ListInterface<E> getAllLessThan(Comparable<E> elementToCompare)  {
        
        ListInterface<E> resultList = new MyLList<>();
        ListNode currentNode = firstNode;
        boolean done = false;
        
        do { 
            E currentElement = currentNode.getData();        
            if (elementToCompare.compareTo(currentElement) > 0) 
                resultList.add(currentElement);
            if(currentNode.getNextNode() == null)
                done = true;
            currentNode = currentNode.getNextNode();
        } while (!done);
        
        return resultList;
    
    } // end getAllLessThan     
    
    
    /** add an existing entry of this list.
       The list size is increased by 1.
       @param newEntry  The object to be added as a new entry. */
    public void add(E newEntry) {

        checkIntegrity();
        
        // get new node to hold newEntry
        ListNode newNode = new ListNode (newEntry);

        // adding to empty list
        if (isEmpty ()) {
            firstNode = newNode;
        }
        
        //add to non-empty list
        else {
            ListNode lastNode = getNodeAt (numberOfEntries);
            lastNode.next = newNode; // make last node reference new node
        } // end if
        lastNode = newNode;
        numberOfEntries ++;        
    }
    
    public boolean add(int newPosition, E newEntry) {
        
        ListNode nodeBefore, nodeAfter;
        
        checkIntegrity();
        
        boolean isSuccessful = true;
        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)){
            // get new node to hold newEntry
            ListNode newNode = new ListNode (newEntry);
            if (isEmpty () || (newPosition == 1)) { // empty or 1st position
                newNode.next = firstNode;
                firstNode = newNode;
                lastNode = newNode;
            } else {// not empty and newPosition > 1
                nodeBefore = getNodeAt (newPosition - 1);
                
                //if insert point was after last node
                if(nodeBefore.next == null) {
                    nodeBefore.next = newNode;
                    newNode.next = null;
                    lastNode = newNode;
                // if insert point was somewhere in the middle of the list//
                } else {
                    nodeAfter = nodeBefore.next;
                    newNode.next = nodeAfter;
                    nodeBefore.next = newNode;
                    lastNode = nodeAfter;
                }
            } // end if

            numberOfEntries ++;
        } else isSuccessful = false;
            
        return isSuccessful;
    }
    
     public void printLinkedList() {

        int nodeCount = 1;
        ListNode currentNode = firstNode;
        E data = (E)currentNode.getData();   

         System.out.println("Node[1]: " + data);
        
        while( (currentNode.getNextNode() != null) ) {

            currentNode = currentNode.getNextNode();
            data = (E)currentNode.getData();
            System.out.println("Node[" + (++nodeCount) + "]: " + data);

        } 
     }

    // Create an iterator object with the provided LinkedList
    @Override
    public LinkedListWithIterator<E> getIterator() {
        return new LinkedListWithIterator<>(this);
    }

    @Override
    public LinkedListWithIterator<E> iterator() {
        return new LinkedListWithIterator<>(this);
    }

    public ListNode getFirstNode() {
        return firstNode;
    }

    
/** 
 *
 * @author kmehta
 */

    public class ListNode {
        
        public E data; // entry in queue
        public ListNode next; // link to next node

        public ListNode(E anEntry) {
            this(anEntry, null);
        }
        
        public ListNode(E anEntry, ListNode n){
            this.data = anEntry;
            this.next = n;        
        }
        
        public E getData() {
            return data;
        }
        
        public ListNode getNextNode() {
            return this.next;
        }
        
        public void setNextNode(ListNode anEntry) {
            this.next = anEntry;
        }
        
        public void setData(E anEntry) {
            this.data = anEntry;
        }

    } // end QueueNode



} // end MyLList


