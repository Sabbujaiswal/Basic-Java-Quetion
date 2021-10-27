package com.shristi.basic;

import java.util.Scanner;

public class Pattern_no1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,M,K;
		System.out.println("Enter the range of the number");
		n=scan.nextInt();
		for( M=1;M<=n;++M) 
		{
			
			for( K=1;K<=M;++K) {
				System.out.print(M);
			}
		
	
			System.out.println("");
		}
		scan.close();
	}

}
