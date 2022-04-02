package com.RaselHomework.java;

import java.util.Scanner;

public class RaselHw2_9ConvertTemtoFahrenhit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dgree Fahrenheit: ");
		double temp = s.nextInt();
		s.close();
		myTemp(temp);
		
		
	}
	public static void myTemp(double temp){
		double fahrenheit = 98;
		double celsius = (fahrenheit -32)* 5/9;
		System.out.println("The Equivalent of celsius is: ");
		System.out.println(celsius);
	}

	
	
}
