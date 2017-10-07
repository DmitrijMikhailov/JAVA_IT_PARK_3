package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void DocumentWork(Document document) throws IOException {
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    document.showDocument();
                }
                break;
                case 2: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToBegin(newLine);
                }
                break;
                case 3: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToEnd(newLine);
                }
                break;
                case 4: {
                    int numberLineRemove = scanner.nextInt();
                    document.remove(numberLineRemove); }  break;
                case 5: { int rNumber = scanner.nextInt();
                String newLine = scanner.next();
                document.rLine(rNumber, newLine);} break;
                case 6: {
                    int numberClearLine = scanner.nextInt();
                    document.clearLine(numberClearLine); } break;
                case 7:
                    System.exit(0);
            }
        }
    }
}