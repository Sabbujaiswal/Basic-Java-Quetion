package com.shristi.basic;

import java.util.Scanner;

public class Smallest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array values:");

		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
		}

		String result = (array[0] < array[1]) && (array[0] < array[2]) ? array[0] + " is Smaller"
				: (array[1] < array[2]) ? array[1] + " is Smaller" : array[2] + " is Smaller";
		System.out.println(result);
		sc.close();

	}
}

