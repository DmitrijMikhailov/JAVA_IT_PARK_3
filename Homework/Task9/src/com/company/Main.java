package com.company;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        List linkedList = new LinkedList();
        Iterator iteratorLinkedList = linkedList.iterator();
        Iterator iterator = list.iterator();
        for (int i = 1; i < 15; i++){
            list.add(i);
        }
        linkedList.addToBegin(1);
        linkedList.addToBegin(2);
        linkedList.addToBegin(3);
        linkedList.addToBegin(4);
        linkedList.add(12);
        //list.delete(2);
        //list.addToBegin(11);
        list.addToIndex(99,3);
        list.deleteForNumber(99);
//        list.expandAnArray();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------LinkedList--------");
        while (iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }
    }
}
