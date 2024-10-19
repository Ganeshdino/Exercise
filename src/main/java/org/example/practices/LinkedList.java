package org.example.practices;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
public class LinkedList {
    Node head;

    // Function to reverse the linked list using recursion
    public Node reverseRecursive(Node node) {
        // Base case: if the list is empty or has reached the last node
        if (node == null || node.next == null) {
            return node;
        }

        // Reverse the rest of the list starting from node.next
        Node newHead = reverseRecursive(node.next);

        // Set the next node's next pointer to the current node (reverse the link)
        node.next.next = node;
        node.next = null; // Set the current node's next pointer to null (new tail)

        return newHead; // Return the new head of the reversed list
    }

    // Helper method to add nodes to the list
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Helper method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original Linked List:");
        list.printList(); // Output: 40 30 20 10

        System.out.println(list.head);

        // Reverse the list recursively
        list.head = list.reverseRecursive(list.head);

        System.out.println("Reversed Linked List:");
        list.printList(); // Output: 10 20 30 40

        java.util.LinkedList<Integer> integerLinkedList = new java.util.LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(20);
        integerLinkedList.add(30);
        integerLinkedList.add(40);
        integerLinkedList.forEach(System.out::print);
    }
}
