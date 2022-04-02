package com.tt.java;

import java.util.Scanner;

public class userInputNameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = myScanner.nextLine();	
		System.out.println("Enter your age");
		int age = myScanner.nextInt();
		
		System.out.println(name + " " + age);

	}

		}


	


