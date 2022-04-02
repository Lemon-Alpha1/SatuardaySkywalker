package com.HomeWork.java;

import java.util.Scanner;

//1. Ask the user for two numbers and print the larger number
public class ArupHw2_1 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the First number :");
		int num = myScanner.nextInt();
		
		System.out.println("Enter second Number :");
		int num2 = myScanner.nextInt();
		myScanner.close();
		if (num > num2) {
			System.out.println("printing the larger number : " + num);
		} else {
			System.out.println("printing the larger number : " + num2);
		}
	}
}
