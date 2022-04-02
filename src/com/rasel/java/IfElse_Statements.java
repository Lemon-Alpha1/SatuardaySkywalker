package com.rasel.java;

public class IfElse_Statements {

	public static void main(String[] args) {
		int age = 18;
		ifElseStatement(age);
	}
	        //IF Else Statement
			//if(Statement/logic){
		public static void ifElseStatement(int age){
		
		
		// int age = 10;
		if(age<13){
		System.out.println("You are kid");
		
		} else if(age<=18){
			System.out.println("You are a Teenager");
			
		} else if(age>60){
			// Nested If Else Statement
			if(age>100){
			System.out.println("You are a Hero");	
			}else{
			System.out.println("You are a Sinior");
		}
		}else {
			System.out.println("You are adult");
		}
		
		
		}
			
		
	}


