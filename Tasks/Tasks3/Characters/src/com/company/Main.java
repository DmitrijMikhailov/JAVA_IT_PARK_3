package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	int ArraySize = scn.nextInt();
	int [] Array = new int[ArraySize];
	int min = Array[0];
	int max = 0;
	for (int i = 0; i< Array.length; i++){
		Array[i] = scn.nextInt();
	}
	for (int i = 1; i < Array.length; i++){
		if (Array[i] > min){
			min = Array[i];
		}



	}
		System.out.println(min);
	}
}
