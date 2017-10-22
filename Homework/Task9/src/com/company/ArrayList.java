package com.company;

public class ArrayList implements List {
    private int MAX_SIZE = 10;
    private int [] arrayList;
    private int count;

    public ArrayList() {
        this.arrayList = new int[MAX_SIZE];
        this.count  = 0;
    }

    @Override
    public void add(int number) {
        if (count == arrayList.length - 1)
            resize(arrayList.length * 2);
        arrayList[count++] = number;
    }

    @Override
    public void addToBegin(int number) {
       if (count == arrayList.length)
           resize(arrayList.length * 2);
       for (int i = count; i > 0; i--){
           arrayList[i] = arrayList[i - 1];
       }
       arrayList[0] = number;
        count ++;
    }

    @Override
    public void addToIndex(int number, int numberIndex) {
        if (count == arrayList.length)
            resize(arrayList.length * 2);
        for (int i = count; i > numberIndex; i--){
            arrayList[i] = arrayList[i - 1];
        }
        arrayList[numberIndex] = number;
        count ++;

    }

    @Override
    public void delete(int numberIndex) {
        for (int i = numberIndex; i< count; i++ ){
            arrayList[i] = arrayList[i+1];
        }
        arrayList[count] = 0;
        count --;
    }

    @Override
    public void deleteForNumber(int number) {
        for (int i = 0; i < count; i++){
            if (arrayList[i] == number)
                for (int l = i; l < count -1; l++){
                arrayList[l] = arrayList[l + 1];
                }
        }
        count --;
    }

    @Override
    public int findFotIndex(int numberIndex) {
       return arrayList[numberIndex];
    }

    @Override
    public void expandAnArray() {
        for (int i = 0; i < count / 2; i++){
            int a = arrayList[i];
            arrayList[i] = arrayList[count - i - 1];
            arrayList[count - i - 1] = a;
        }
    }

    private void resize(int newSize){
        int [] newArray = new int[newSize];
        System.arraycopy(arrayList,0,newArray,0,count);
        arrayList = newArray;
    }
    public int size(){
        return count;
    }
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public int next() {
            int element = arrayList[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}
