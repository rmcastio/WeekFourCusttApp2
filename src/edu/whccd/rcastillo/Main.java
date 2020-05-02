package edu.whccd.rcastillo;

/* This custom app is for utilizing for and while loops.
Author: Richard Castillo
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		System.out.print("Enter an Integer between 20-50: ");

		int limit = 0;
		int currentNumber = 0;
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();


		if (limit < 20 || limit > 50) {
			System.out.println("invalid input");
		}
		for (int i = 1; i <= limit; i++)
			if (i % 2 == 0) {
				System.out.println(i);
			}

		System.out.println("*************************");
		System.out.println("Odd Numbers decrementing");

		currentNumber = limit;

		while (currentNumber > 0) {
			currentNumber--;
			if (currentNumber % 2 == 1) {
				System.out.println(currentNumber);
			}
		}
	}



}
