package com.HomeWork.java;
//A school has the following rules for grading system:
//● a. Below 25 - F
//● b. 25 to 45 - E
//● c. 45 to 50 - D
//● d. 50 to 60 - C
//● e. 60 to 80 - B
//● f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class ArupHw2_4SchoolGradingSystem {

	//private static Scanner myScanner;

	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter The Exam MARKS :");
		int grade = myScanner.nextInt();
		
		if (grade<25){
			System.out.println("Grade : F");
		}else if (grade<=45){
			System.out.println("Grade :E");
		}else if (grade<=50){
			System.out.println("Grade :D");
		}else if (grade<=60){
			System.out.println("Grade :C");
		//}else if (grade<=70){
			//System.out.println("Grade :B");
		}else if (grade<80){
			System.out.println("Grade :B");
		}else{
		System.out.println("The grade is : A");
		}
	}
	
	
}
