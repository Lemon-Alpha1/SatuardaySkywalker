package com.HomeWork.java;

import java.util.Scanner;

////3.Calculate the bonus amount of an employee
public class ArupHw2_3CalculateBonusEmployee {

	public static void main(String[] args) {

		int bonus = 0;
		int year = 0;
		int increment = 8;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter the Salary :");
		int salary = myScanner.nextInt();

		if (salary < 100000) {
			System.out.println("NOT ELIGIBLE FOR BONUS");
		}

		else {
			System.out.println("Enter the year :");
			year = myScanner.nextInt();
			
			if(year>=6){
				System.out.println("No Bonus");
			}
			else if(year>=5){
				System.out.println("Bonus is 8000");
			}
			else if (year>5){
				System.out.println("The bonus is: " + increment+year+"000");
			}
		}

	}

}
