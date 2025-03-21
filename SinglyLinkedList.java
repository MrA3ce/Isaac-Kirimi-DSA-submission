public class SinglyLinkedList {
    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = head;

        head = newNode;
    }
    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
    
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    // Method to delete node from beginning of the list
    public void deleteFromBeginning() {
        // If the list is empty, nothing to delete
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        
        // Update head to point to the next node
        head = head.next;
    }
    
    // Method to display the list
    public void display() {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        // Traverse and print each node
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Insert nodes at the beginning
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        
        System.out.println("After inserting 10, 20, 30 at the beginning:");
        list.display();
        
        // Insert nodes at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        
        System.out.println("After inserting 40, 50 at the end:");
        list.display();
        
        // Delete nodes from the beginning
        list.deleteFromBeginning();
        
        System.out.println("After deleting from the beginning:");
        list.display();
        
        list.deleteFromBeginning();
        
        System.out.println("After deleting from the beginning again:");
        list.display();
    }
}