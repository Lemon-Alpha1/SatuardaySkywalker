package com.RaselHomework.java;
/* Problem8. Write Java Program to display Factorial of Number 7. */


public class RaselHw2_8FactorialNumber {

	public static void main(String[] args) {
		myFactorialNumber();

	}
	public static void myFactorialNumber(){
		int n = 7;
		int factorial =1;
		for(int i =1; i<=n; i++){
			factorial = factorial * i;
		}
		System.out.println("The factoril of 7 is " + factorial);
	}

}
