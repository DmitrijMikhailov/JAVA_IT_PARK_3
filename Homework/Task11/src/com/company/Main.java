package com.company;

import com.company.Utils.ArrayList;
import com.company.Utils.DataReader;
import com.company.Utils.Human;
import com.company.Utils.Utils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataReader nameReader = new DataReader("name.txt");
        DataReader ageReader = new DataReader("name.txt");
        ArrayList arrayList = new ArrayList();
        String name = nameReader.readString();
        int age = ageReader.readInteger();
        Human human = new Human(name,age);
        while (age!=0){
            name = nameReader.readString();
            age = ageReader.readInteger();
            Human humans = new Human(name, age);
            arrayList.insertByIndex(humans,age);
        }
        Utils.linkedInOneList(arrayList.getElements());
        arrayList.printArray();
    }
}
