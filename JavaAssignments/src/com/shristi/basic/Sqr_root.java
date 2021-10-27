package com.shristi.basic;

import java.util.Scanner;

public class Sqr_root {

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
		
		for(int var:array) {
			System.out.println(Math.sqrt(var));
		}
		sc.close();

	}

}
