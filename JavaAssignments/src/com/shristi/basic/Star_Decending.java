package com.shristi.basic;

import java.util.Scanner;

public class Star_Decending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the star");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
				System.out.print("*  "+"\t");
			System.out.println();
			
		}

	}
	
	


}
