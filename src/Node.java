/**
 * Node.java
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class Node {

    String customerName;
    Node next;

    public Node(String customerName) {

        // Step 1: Store the customer's name.
        this.customerName = customerName;
        // Step 2: Initialize the next pointer as null.
        next = null;
    }
}