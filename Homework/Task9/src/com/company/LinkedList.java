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
    head = newNode;
    if (newNode !=null)
        newNode.next = head;
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

    }

    @Override
    public void delete(int numberIndex) {

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
        return 0;
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
