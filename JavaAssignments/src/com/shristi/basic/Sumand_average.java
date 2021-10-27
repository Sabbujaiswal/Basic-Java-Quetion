package com.shristi.basic;

import java.util.Scanner;

public class Sumand_average {

	public static void main(String[] args) {
		int Size, i, Sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter length of elements in an array : ");
		Size = sc.nextInt();

		int[] a = new int[Size];

		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++) {
			a[i] = sc.nextInt();
		}

		for (i = 0; i < Size; i++) {
			Sum = Sum + a[i];
		}

		System.out.println(" The Sum of All Elements in this Array = " + Sum);
		System.out.println("Average of the number :" + Sum / Size);
		sc.close();
	}

}
