package com.shristi.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("enter input");
		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		Integer N = Integer.parseInt(input);

		int Maximumno = N;
		int Previouse_no = 1;
		int Next_no = 2;
		for (int i = 1; i <= Maximumno; ++i) {
			System.out.println(Previouse_no);
			int sum = Previouse_no + Next_no;
			Previouse_no = Next_no;
			Next_no = sum;
		}
		scan.close();
	}

}
