package com.shristi.basic;

import java.util.Scanner;



public class Armstong_n0 { 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the input");
		
		String input = scan.next();
		
		Integer to_int = Integer.parseInt(input);
		int original = to_int;
		
		int result =0;
		
		while(original!=0) {
			
			int remainder = (original%10);
			result =(int) (result + (Math.pow(remainder, input.length())));
			original /= 10;
		}
		
		if(result == to_int) {
			
			System.out.println("Yes, the given number is an armstrong number");
		}
		else {
			System.out.println("No, it is not an armstrong number");
		}
		
		scan.close();
	}

}
