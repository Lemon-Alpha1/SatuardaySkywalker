package com.tt.java;

import java.util.Scanner;

public class GetUserChar {

	public static void main(String[] args) {
		
			Scanner newScanner = new Scanner(System.in);
			System.out.println("Enter user name");
			
			String name = newScanner.nextLine();
			
			
			
			if(name.equals("Lemon")) {
				System.out.println("Is a student");
			}else if(name.equals("Arup")) {
				System.out.println("Is a trainer");
			}else if(name.equals("Alan")) {
				System.out.println("Is a student");
			}else {
				System.out.println("Is not a student");
			}
		}
	
		
	}
	



