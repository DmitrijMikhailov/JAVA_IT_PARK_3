package com.company;


public class IteratorImpl implements Iterator {
   private int currentIndex = 0;

    @Override
    public int next(int[] arrayLists, Iterator iterator) {
        return arrayLists[currentIndex++];
    }

    @Override
    public boolean hasNext(int[] arrayList, int size) {
        return currentIndex < size && arrayList[currentIndex] != 0;
    }
}
