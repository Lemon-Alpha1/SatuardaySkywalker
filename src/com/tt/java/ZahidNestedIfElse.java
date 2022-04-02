package com.tt.java;

public class ZahidNestedIfElse {

	public static void main(String[] args) {
		int grade= 150;
		if(grade>90){
			System.out.println("Student got an A");
		}
		if(grade>95 && grade<100){
			System.out.println("Student got an A+");
		}
		else if(grade>80) {
			System.out.println("Student got an B");
		}
		else if(grade>70) {
			System.out.println("Student got an C");
		}
		else if(grade>60) {
			System.out.println("Student got an D");
		}
		else {System.out.println("Student got Failed");}
		
	}
}
