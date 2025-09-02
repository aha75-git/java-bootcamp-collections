package org.example.bootcamp.collections.bonus;

public class Beutel {
    private int size = 0;
    private Node head;

    //Implementiere Schritt für Schritt die Methoden add, get, size, remove last, remove by index und

    public void add(int element) {
        Node newNode = new Node(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        Node currentNode = this.head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        if (index == 0) {
            head = head.next;
        }  else {
            Node currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
        }
        size--;
    }

    public void removeLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node currentNode = this.head;
        for (int i = 0; i < this.size - 2; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
    }

    class Node {
        int element;
        Node next;
        Node(int element) {
            this.element = element;
        }
    }

    public void printElements() {
        Node currentNode = this.head;
        for(int i = 0; i < this.size; i++) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
    }
}
