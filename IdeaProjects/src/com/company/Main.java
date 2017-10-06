package com.company;
import java.util.Arrays;
public class Main {
    public static int myPower(int mPow) {
        int pow = 1;
        for (int i = 0; i < mPow; i++)
            pow = pow * 10;
        return pow;
    }
    public static int powerRecursion(int argument, int pow) {
        if (pow == 0 || argument == 1)
            return 1;
        return argument * powerRecursion(argument,pow-1);
    }
    public static int parse(char array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++)
            result = result + (array[i] - 48) * powerRecursion(10,array.length - 1 - i); /*myPower(array.length - 1 - i)*/
        return result;
    }
    public static void main(String args[]) {
        char arrayNumberChar[] = {'1', '2', '3', '0','5','6','7','8','9'};
       System.out.println("Массив типа char: " + Arrays.toString(arrayNumberChar) +
                        "\n" + "Число хранящееся в массиве: " + parse(arrayNumberChar));
    }
}
