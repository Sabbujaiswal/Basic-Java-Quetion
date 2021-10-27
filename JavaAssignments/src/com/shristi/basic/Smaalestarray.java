
package com.shristi.basic;

import java.util.Scanner;

public class Smaalestarray {

	public static void main(String[] args) {
		int number[], size, small;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter th size of the array:");
		size = user_input.nextInt();
		number = new int[size];
		System.out.println("Enter the element of the array:");
		for (int i = 0; i < number.length; i++) {
			number[i] = user_input.nextInt();

		}
		small = number[0];
		for (int i = 1; i < number.length; i++) {
			if (small > number[i]) {
				small = number[i];

			}
		}
		System.out.println("smallest value is:" + small);
		user_input.close();
	}

}
