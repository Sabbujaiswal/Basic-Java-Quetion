package com.shristi.basic;
import java.util.Scanner;

public class Factorialfornumber {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		n = scanner.nextInt();
		scanner.close();

        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);

	}


	}


