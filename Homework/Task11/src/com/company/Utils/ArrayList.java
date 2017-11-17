package com.company.Utils;

public class ArrayList<T> {
    private static final int MAX_SIZE = 100;
    private LinkedList<T> elements[];
    private int count;

    public ArrayList() {
        this.elements = new LinkedList[MAX_SIZE];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new LinkedList();
        }
        this.count = 0;
    }

    public LinkedList<T>[] getElements() {
        return elements;
    }

    public void insertByIndex(T element, int index) {
        elements[index].addToBegin(element);
    }

    public void printArray() {
        Utils.printList(elements[0]);
    }
}
