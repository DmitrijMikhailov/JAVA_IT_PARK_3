package com.company;

/**
 * Created by Дмитрий on 03.10.2017.
 */
// Класс документ - отдельный файл
// от класса можно создавать ОБЪЕКТЫ
public class Document {
    // каждый объект класса будет иметь свои копии
    // count и lines
    int count = 0;
    String lines[] = new String[3];

    void showDocument() {
        for (int i = 0; i < lines.length; i++) {
            // тернарный условный оператор e ? a : b
            String lineToOut = lines[i] == null ? "_______" : lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    void addLineToBegin(String newLine) {
        for (int i = count; i > 0; i--) {
            lines[i] = lines[i - 1];
        }
        lines[0] = newLine;
        count++;
    }
    void addLineToEnd(String newLine) {
        lines[count] = newLine;
        count++;
    }
    void remove(int numberLineRemove) {
        for (int i = 0; i < lines.length; i++){
            lines[numberLineRemove + i] = lines[numberLineRemove + i + 1];
        }
        lines[lines.length - 1] = null;
        count --;
    }
    void rLine(int rNumber, String newLine){
        lines[rNumber] = newLine;
    }
    void clearLine(int numberClearLine){
        lines[numberClearLine] = null;
    }
}