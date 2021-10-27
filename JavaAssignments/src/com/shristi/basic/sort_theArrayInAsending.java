package com.shristi.basic;


import java.util.Arrays;
import java.util.Scanner;

public class sort_theArrayInAsending {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int j = input.nextInt();
		System.out.println("Enter the array");
		int given_array[] = new int[j];
		
		for (int i = 0; i < given_array.length; i++) {
			given_array[i] = input.nextInt(); 
		}
		
		Arrays.sort(given_array);
		System.out.println("The sorted array : ");
		
		for (int i = 0; i < given_array.length; i++) {
			System.out.print(given_array[i]+"\t");
		}
		input.close();
	}
}
	



	


