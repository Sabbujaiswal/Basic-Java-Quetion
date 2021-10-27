package com.shristi.basic;

public class Greatest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		int c = 2;

		String Greatest_no = (a > b && a > c) ? "a is Greatest" : (b > c) ? "b is greatest" : "c is greatest";
		System.out.println("Greatest_no: " + Greatest_no);

	}

}
