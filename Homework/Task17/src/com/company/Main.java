package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean isFounded;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы:");
        int column = scanner.nextInt();
        System.out.println("Введите количество строк матрицы:");
        int row = scanner.nextInt();
        int[][] matrix = new int[column][row];
        Random random = new Random();
        // наполняем матрицу числами
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = random.nextInt(1001);
            }
        }
        ThreadPool threadPool = new ThreadPool(24);
        // пауза для правильного отображения выводимого текста
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
        System.out.println("Введите число которое хотите найти в матрице:");
        int number = scanner.nextInt();
        // проверка
        if (number > 1000 || number < 0) {
            System.out.println("Такого числа в матрице не существует");
            System.exit(0);
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                int temp = matrix[i][j];
                int tempi = i;
                int tempj = j;
                threadPool.submitTask(() -> {
                    if (number == temp) {
                        System.out.println("Найдено 100% совпадение в столбце: " + tempi + ", строке " + tempj + ".");
                        System.out.println("Число нашёл - " + Thread.currentThread().getName());
                        threadPool.shutdown();
                        isFounded = true;
                    }
                });
            }
        }
        // пауза для отработки программы перед проверкой условия
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
        if (!isFounded) {
            System.out.println("Такого числа не найдено");
        }
        System.exit(0);
    }
}