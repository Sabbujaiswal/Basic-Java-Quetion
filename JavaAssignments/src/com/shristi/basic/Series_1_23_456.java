package com.shristi.basic;

import java.util.Scanner;

public class Series_1_23_456 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the range of series");
	int n=sc.nextInt();
	int count=1;
	for(int i=1;i<=n;i++ ) {
		
		for(int j=1;j<i+1;j++) {
			System.out.print(count +" ");
			count=count+1;
			
		}
		System.out.println()
		;
	}
		
sc.close();
	}

}
