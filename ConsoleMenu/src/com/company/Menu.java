package com.company;

/**
 * Created by Дмитрий on 03.10.2017.
 */
public class Menu {
    public static void showMenu() {
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документ");
        System.out.println("2. Вставить строку в начало");
        System.out.println("3. Вставить строку в конец");
        System.out.println("4. Удалить строку"); // спросить, какую строку удалить - сделать сдвиг
        System.out.println("5. Заменить строку");
        System.out.println("6. Очистить строку");
        System.out.println("7. Выход");
    }
    public static void showObjectDocumentMenu(){
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документы");
        System.out.println("2. Создать документ");
        System.out.println("3. Удалить документ");
        System.out.println("4. Работать с документом");
        System.out.println("5. Выход");
    }
}