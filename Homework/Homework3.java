
import java.util.Scanner;
public class Homework3 {
        public static void sortArray(int[] array){


            int sumC = 0, sumN = 0, sumChetPosition = 0, sumNechetPosition = 0;
            ///Задание 1&2
            for (int i = 0; i < array.length; i++){
                if (array[i] % 2 == 0){
                    sumC = sumC + array[i];
                }else sumN = sumN + array[i];
            }
            //Задание 3&4
            for (int i = 1; i < array.length; i++){
                if (i % 2 == 0){
                    sumChetPosition = sumChetPosition + array[i];
                } else sumNechetPosition = sumNechetPosition + array[i];
            }
            //Задание 5
           int quality = 0;
            for (int i = 0; i < array.length - 2; i++){
                if (array[i] < array[i+1] & array[i+1] > array[i + 2])
                    quality++;
                
            }
            //Задание 6
           int quality2 = 1;
            for (int i = 0 ; i < array.length-1; i++){
                if (array[i] < array[i + 1]){
                    quality2++;
                }else if (array[i]>= array[i + 1]) quality2 = 1;
            }
            //Задание 7
            System.out.print("Задание №7: ");
            for (int i = 0; i < array.length; i++){
                if (array[i] == 0){
                    array[i] = array[i + 1] * -1;
                }
                System.out.print("|" + array[i] + "|");
            }
             System.out.println();
            System.out.println("Сумма четных элементов: " + sumC +
                    "\n" + "Сумма не четных элементов: " + sumN +
                    "\n" + "Сумма элементов, стоящих на четной позиции: " + sumChetPosition +
                    "\n" + "Сумма элементов, стоящих на нечетной позиции: " + sumNechetPosition +
                    "\n" + "Количество локальных максимумов: " + quality+
                    "\n" + "Длина последовательности: " + quality2);
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int sizeArray = scn.nextInt();
        int [] array = new int[sizeArray];
        System.out.println("Введите массив");
        for (int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        sortArray(array);
    }
}
