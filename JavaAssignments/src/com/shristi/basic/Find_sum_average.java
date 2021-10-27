package com.shristi.basic;

import java.util.Scanner;

public class Find_sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		int arr_Length = array.length;
		int Sum =0;
		for (int i= 0;i<arr_Length;i++) {
			Sum += array[i];
		}
		
		System.out.println("Sum of numbers : "+ Sum);
		System.out.println("Average of numbers : "+ Sum/arr_Length);
		sc.close();
	}

}
