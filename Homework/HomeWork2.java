

import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayIn = new int [998];
        int findNumber, sum =0;
            for (int k = 0; k  < arrayIn.length; k++){
                arrayIn [k] = scanner.nextInt();
        }
            for (int i = 0; i<arrayIn.length; i++){
                sum = sum + arrayIn[i];
            }
            findNumber = 1000 - sum;
            System.out.println("Otvet: " + findNumber);
    }

}