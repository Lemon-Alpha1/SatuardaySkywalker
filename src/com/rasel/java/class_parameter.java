package com.rasel.java;

public class class_parameter {

	public static void main(String[] args) {
		String password = "12345";
		String Username = "Lemon";
		Login(Username, password);
		
		
	}
		public static void Login(String username, String Password){
			System.out.println("Username:  "+username);
			System.out.println("password:  "+ Password);
			
	}

}
