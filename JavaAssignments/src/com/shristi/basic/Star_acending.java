package com.shristi.basic;

import java.util.Scanner;

public class Star_acending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter seriese Range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
				System.out.print("* ");
			
		}
		System.out.println();
		}
		sc.close();
	}
}