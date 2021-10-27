package com.shristi.basic;

import java.util.Scanner;

public class Perfect_no {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");

		int given_input = input.nextInt();
		int sum = 0;

		for (int i = 1; i < given_input; i++) {

			if (given_input % i == 0) {

				sum += i;
			}

		}

		if (given_input == sum) {
			System.out.println("Yes, the given number is a perfect number");
		} else {
			System.out.println("No the given number is not a perfect number");
		}
		input.close();
	}

}
