package com.company.Utils;

public class LinkedList<T> {

    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public Node getNode() {
        return head;
    }

    public void addToBegin(T element) {
        // создали узел для элемента
        Node newNode = new Node(element);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        count++;
    }

    public void concat(LinkedList<T> otherList) {
        Node lastNode = null;
        LinkedListIterator iterator = new LinkedListIterator();
        if (head.human.getAge() != 0) {
            while (iterator.hasNext()) {
                lastNode = iterator.currentNode;
                iterator.next();
            }
            lastNode.next = otherList.getNode();
        } else {
            head = otherList.getNode();
            count--;
        }
        this.count += otherList.getCount();
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator<T> implements Iterator<T> {

        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public T next() {
            T element = (T) currentNode.human.getHuman();
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node<T> {
        private Human human;
        private Node next;

        Node(T element) {
            this.human = (Human) element;
            this.next = null;
        }
    }
}
