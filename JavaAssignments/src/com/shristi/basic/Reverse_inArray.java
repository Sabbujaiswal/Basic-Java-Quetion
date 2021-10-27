package com.shristi.basic;

import java.util.Scanner;

public class Reverse_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elemnt: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the array element"+i+1);
			arr[i]=sc.nextInt();
		}
System.out.println("Original elements are:");
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println("\nReversed element are:");
for(int i=n-1;i>=0;i--) {
	System.out.println(arr[i]+" ");
}

	}
	

}
