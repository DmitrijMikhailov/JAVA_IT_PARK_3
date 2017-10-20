package com.company;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 1; i < 15; i++){
            list.add(i);
        }
        list.delete(2);
        System.out.println(list.find(1));
        Iterator iterator = new IteratorImpl();
        list.returnIterator(iterator);
    }
}
