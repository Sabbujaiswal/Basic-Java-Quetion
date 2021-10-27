package com.shristi.basic;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre the input");
		String input=scan.next();
		Integer to_int=Integer.parseInt(input);
		int num=to_int;
		boolean isPrime = true;
		for(int i=2;i<num;++i) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+"is a prime number");
		}else 
		{
			
			System.out.println("Is not a prime number");
			
			

			}

	}
	
}
