package com.company;

public class ArrayList implements List {
    private int size = 10;
    private int [] arrayList = new int[size];
    private int count = 0;
    @Override
    public void add(int number) {
        if (count == arrayList.length - 1)
            resize(arrayList.length*2);
        arrayList[count++] = number;
    }
    @Override
    public void delete(int number) {
        for (int i = number; i< count; i++ ){
            arrayList[i] = arrayList[i+1];
        }
        arrayList[count] = 0;
        count --;
    }
    @Override
    public int find(int number) {
       return arrayList[number];
    }
    @Override
    public void returnIterator(Iterator iterator) {
        while (iterator.hasNext(arrayList,arrayList.length)){
            System.out.println(iterator.next(arrayList, iterator));
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
}
