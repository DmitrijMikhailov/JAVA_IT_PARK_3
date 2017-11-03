package com.company;

/**
 * Created by Дмитрий on 22.10.2017.
 */
public class LinkedList implements List {
    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public void add(int number) {
        Node newNode = new Node(number);
        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public void addToBegin(int number) {
        Node newNode = new Node(number);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        count++;
    }

    @Override
    public void addToIndex(int number, int numberIndex) {
            Node newNode = new  Node(number);
           if (numberIndex == count)
            newNode.value = number;
            count++;
    }

    @Override
    public void delete(int numberIndex) {
       Node indexNode = head;
       Node next = indexNode.next;
       for (int i = 0; i < numberIndex; i++){
           if (indexNode.next != null) {
               indexNode = next;
               next = indexNode.next;
           }
       }
       indexNode.value = next.value;
        indexNode.next = next.next;
        count--;
    }

    @Override
    public void deleteForNumber(int number) {

    }

    @Override
    public int findFotIndex(int numberIndex) {

        return 0;
    }

    @Override
    public void expandAnArray() {
        Node temp = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;
        }
        head = temp;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public int next() {
            int element =  currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    @Override
    public int size() {
        return count;
    }
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
