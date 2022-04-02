package com.HomeWork.java;

import java.util.Scanner;

public class ArupHw2_5StringInput {

	public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
				
				String words;
				
				System.out.println("Please type out at least two words");
				
				words= input.nextLine();
				System.out.println(	words.toUpperCase());
				System.out.println(	words.toLowerCase());
				System.out.println(	words.replace(" ", ""));
				String noSpaces= words.replace(" ", "");
				System.out.println(noSpaces.length());
		  

	}

}
