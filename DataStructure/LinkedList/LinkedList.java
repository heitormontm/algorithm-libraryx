package LinkedList;
public class LinkedList {

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head; 
    private int size;  

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    public void removeLast() {
        if (head == null) return; 

        if (head.next == null) {
            head = null; 
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null; 
        }

        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.value = value;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
