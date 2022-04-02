package com.rasel.java;

import java.util.HashMap;

public class Exercise_Class_3 {

	public static void main(String[] args) {
		
		
		int age= 30;
	

	}

	
	HashMap<String, String> Hometown = new HashMap<String, String>();
	Hometown.put("Soniah", "Sylhet");
	Hometown.put("Habib", "Dhaka");
	Hometown.put("Mahmud", "Barishal");
	Hometown.put("Patwary", "Noakhali");
	System.out.println("Hometown : "+Hometown.get("Patwary"));
	
	HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
	StudentAge.put("Soniah", 25);
	StudentAge.put("Habib", 38);
	StudentAge.put("Mahmud", 28);
	StudentAge.put("Patwary", 45);
	System.out.println("StudentAge : "+StudentAge.get("Habib"));
	
	//Hashset store unordered collection containing unique value, Implementation of Set interface
	HashSet<String> Car = new HashSet<String>();
	Car.add("Toyota");
	Car.add("BMW");
	Car.add("Audi");
	System.out.println("Hashset Value : "+ Car);
}
}
