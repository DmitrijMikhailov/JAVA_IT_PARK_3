package com.company;

/**
 * Created by Дмитрий on 01.10.2017.
 */
public class Recursion {
    public static void main(String[] args) {
        int pow = 4, argument = 5;
        System.out.println(Recursion.powerRecursion(argument,pow));
        System.out.println(otOneDoN(pow));
        System.out.println(otAdoB(pow,argument));
         if (twoPow(pow) == 1) {
             System.out.println("Yes");

         } else {
             System.out.println("No");
         }
         System.out.println(sumN(pow));
    }
    private static int powerRecursion(int argument, int pow) {
        if (pow == 0 || argument == 1)
            return 1;
        return argument * powerRecursion(argument,pow-1);
    }
    public static String otOneDoN(int n){
            if (n == 1)
                return "1";
            return  otOneDoN(n -1) + " " + n;
    }
    public static String otAdoB(int a, int b){
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + otAdoB(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + otAdoB(a + 1, b);
        }
    }
    public static int twoPow(int n){
        if (n == 1)
            return 1;
        if (n > 1 && n < 2)
            return 0;
        return twoPow(n/2);
    }
    public static int sumN(int n){
        if (n == 0)
            return 0;
        return sumN(n-1) + n;
    }
}
