package com.RaselHomework.java;

public class Class_4_Hw_Reverse_String {

	public static void main (String[]args){
		
		String stringExample = "Lemon";
		System.out.println("Original string:   "+ stringExample);
		
		StringBuilder reverseString = new StringBuilder(stringExample);
	reverseString.reverse();
	String result = reverseString.toString();
	System.out.println( "Reverse string:     "+ result);
	
	}
	
}
