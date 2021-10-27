package com.shristi.basic;

import java.util.Scanner;

public class Greaterarray {

	public static void main(String[] args) {

		int number[], size, large;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = user_input.nextInt();
		number = new int[size];
		System.out.println("Enter the elements of array:");

		for (int i = 0; i < number.length; i++) {
			number[i] = user_input.nextInt();

		}

		large = number[0];
		for (int i = 1; i < number.length; i++) {
			if (large < number[i]) {
				large = number[i];

			}
		}
		System.out.println("Largest value is:" + large);
		user_input.close();
	}

}
