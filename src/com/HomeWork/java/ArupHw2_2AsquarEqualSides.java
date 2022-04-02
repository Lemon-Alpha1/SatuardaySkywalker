package com.HomeWork.java;

import java.util.Scanner;

//2.: A square has all equal sides
public class ArupHw2_2AsquarEqualSides {

	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
       
		System.out.println("Enter the lenth :");
		int lenth = myScanner.nextInt();
		
		System.out.println("Enter the width :");
		int width = myScanner.nextInt();
		 myScanner.close();
		if (lenth ==width){
			System.out.println("That is a Square");
			
		}else{
			System.out.println(" that is not a Square");
		}
	}
	
	
	}




