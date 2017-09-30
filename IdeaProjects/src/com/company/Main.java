package com.company;
import java.util.Arrays;
public class Main {
    public static int myPower(int mPow) {
        int pow = 1;
        for (int i = 0; i < mPow; i++)
            pow = pow * 10;
        return pow;
    }
    public static int parse(char array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++)
            result = result + (array[i] - 48) * myPower(array.length - 1 - i);
        return result;
    }
    public static void main(String args[]) {
        char arrayNumberChar[] = {'1', '2', '3', '4','5','6','7','8','9'};
       System.out.println("Массив типа char: " + Arrays.toString(arrayNumberChar) +
                        "\n" + "Число хранящееся в массиве: " + parse(arrayNumberChar));
    }
}
