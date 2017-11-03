package com.company;

public class Main {
    public  static void printList(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        List linkedList = new LinkedList();

        for (int i = 1; i < 15; i++){
            list.add(i);
        }
        linkedList.addToBegin(1);
        linkedList.addToBegin(2);
        linkedList.addToBegin(3);
        linkedList.addToBegin(4);
        linkedList.addToBegin(5);
        linkedList.addToBegin(6);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.addToIndex(19,1);
        //list.delete(2);
        //list.addToBegin(11);
        list.addToIndex(99,3);
        //list.deleteForNumber(6);
        linkedList.delete(5);
//        list.expandAnArray();
        printList(list);
        System.out.println("-------LinkedList--------");
        printList(linkedList);
    }
}
