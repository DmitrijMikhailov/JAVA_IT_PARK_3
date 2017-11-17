package com.company.Utils;

public class Utils {

    public static void printList(LinkedList list) {
        Iterator iterator = list.iterator();

        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }

    public static void linkedInOneList(LinkedList elements[]) {
        for (int i = 1; i < elements.length; i++) {
            elements[0].concat(elements[i]);
        }
        for (int i = elements.length - 1; i > 0; i--) {
            elements[i] = null;
        }
    }
}
