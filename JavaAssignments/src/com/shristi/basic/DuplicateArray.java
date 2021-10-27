package com.shristi.basic;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		
		int count =0;
		
		for(int i = 0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
			