package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Secondlargestinarray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element of array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of the array:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Array Elements are:" + Arrays.toString(arr));
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] == max)
				sec_max = max;
			else if (arr[i] > max) {
				sec_max = max;
				max = arr[i];
			} else if (arr[i] > sec_max)
				sec_max = arr[i];

		}
		System.out.println("Second Maximum Value" + sec_max);
		sc.close();
	}

}
