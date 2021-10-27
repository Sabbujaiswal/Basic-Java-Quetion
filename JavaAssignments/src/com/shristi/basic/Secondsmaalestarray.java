package com.shristi.basic;

import java.util.*;

public class Secondsmaalestarray {

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
		int min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] == min)
				sec_min = min;
			else if (arr[i] < min) {
				sec_min = min;
				min = arr[i];
			} else if (arr[i] < sec_min)
				sec_min = arr[i];

		}
		System.out.println("Second Lowest Value" + sec_min);
		sc.close();
	}

}
