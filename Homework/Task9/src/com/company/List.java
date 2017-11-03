package com.company;


public interface List {
    void add(int number);
    void addToBegin(int number);
    void addToIndex(int number, int numberIndex);
    void delete(int numberIndex);
    void deleteForNumber(int number);
    int findFotIndex(int numberIndex);
    void expandAnArray();
    Iterator iterator();
    int size();
}
