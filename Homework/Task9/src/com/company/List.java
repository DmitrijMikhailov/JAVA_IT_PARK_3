package com.company;


public interface List {
    void add(int number);
    void delete(int number);
    int find(int number);// найти по индексу
    void returnIterator(Iterator iterator);
}
