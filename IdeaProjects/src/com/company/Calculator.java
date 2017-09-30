package com.company;
import java.util.Scanner;
/**
 * Created by Дмитрий on 30.09.2017.
 */
public class Calculator {
    public static double mCal(int a, int b, String y) {
        double result = 0;
        switch (y) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) result = a / b;
                else return 0;
                break;
        }
        return result;
    }
    public static void enterMatrix(double [][] array){
        Scanner scn = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j]= scn.nextInt();
            }
        }
    }
    public static double [][] multiMatrix(double [][] array, double [][] arrayTwo){
        int multi = 0;
        double arrayResult [][] = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                for (int k = 0; k < array.length; k++){
                    multi += array[i][k] * arrayTwo[k][j];}
                arrayResult[i][j] = multi;
            }

        }
        return arrayResult;
    }
    public static double [][] sumMatrix(double [][] array, double [][] arrayTwo){
        double arrayResult [][] = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                arrayResult[i][j] = array[i][j] + arrayTwo[i][j];
            }
        }
        return arrayResult;
    }
    public static double [][] minusMatrix(double [][] array, double [][] arrayTwo){
        double arrayResult [][] = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                arrayResult[i][j] = array[i][j] - arrayTwo[i][j];
            }
        }
        return arrayResult;
    }
    public static void exitMatrix(double [][] array){
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void  main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        String arithmeticOperationSelection, calculatorSelection;
        System.out.println("Введите \"calc\" ,чтобы воспользоваться обычным калькулятором или введите \"enterMatrix\" чтобы воспользоваться калькулятором матриц");
        calculatorSelection = scn.next();
        System.out.println("Введите первое число/размерность первой матрицы: ");
        a = scn.nextInt();
        System.out.println("Введите арифметическую оперцию: ");
        arithmeticOperationSelection = scn.next();
        System.out.println("Введите второе число/размерность второй матрицы: ");
        b = scn.nextInt();
        double arrayOne [][] = new double[a][b];
        double arrayTwo [][] = new double [a][b];
        switch (calculatorSelection) {
            case "calc":  System.out.println("Результат: " + mCal(a, b, arithmeticOperationSelection)); break;
            case "enterMatrix":
                enterMatrix(arrayOne);
                enterMatrix(arrayTwo);
                switch (arithmeticOperationSelection){
                    case "*": System.out.println("Результат: " ); exitMatrix(multiMatrix(arrayOne, arrayTwo));  break;
                    case "+": System.out.println("Результат: " ); exitMatrix(sumMatrix(arrayOne, arrayTwo)); break;
                    case "-": System.out.println("Результат: " ); exitMatrix(minusMatrix(arrayOne, arrayTwo)); break;
                } break;
        }
    }
}

