package com.tt.java;

import java.util.HashMap;
import java.util.HashSet;

public class Array {

	public static void main(String[] args) {
		// Array store multiple data using index
		//int age = 30; this a variable just carry one value
		int []ageSkywalker = new int []{25,35, 30, 40, 32, 28};
		
		// Index                         0  1   2   3   4  5
		
		String [] Name = new String[]{ "Lemon", "Rony", "Tania"};
		
		System.out.println(" Array Value:   " + ageSkywalker[2]);
		System.out.println(" Array Length:  " + ageSkywalker.length);
		System.out.println(" Array Value:   " + Name[0]);
		System.out.println(" Array Length:  " + Name.length);
		
		// Multi Dimention Arry:
		
		int [][] age2D = new int [][]{{25,35, 30, 40, 32, 28},// 0 1 2 3 4 5
				                      {60, 70,80}              // 0 1 2
		};
				
		System.out.println(" Array  two Dimention:   " + age2D[1][2]);	
		for (int  i = 0; i<age2D.length; i++){
			for (int j =0; j<age2D[i].length;j++){
				System.out.println("Multi dimention Array  :"  +age2D[i][j]);
			}
		}
		
		//HashMap :
		//HashMap store data using key and value pair, implemetion of map interface
		// HasMap< k, v >
		HashMap<String, String> HomeTown = new HashMap<String, String>();
		HomeTown.put("Lemon", "Queens");
		HomeTown.put("Sohana", "Queens");
		HomeTown.put("Sonia", "Manhattan");
		HomeTown.put("Fatima", "Queens");
		
		System.out.println("Home Town: "+HomeTown.get("Lemon"));
		
		HashMap<String, Integer> StudentAge = new HashMap<String,Integer >();
		StudentAge.put("Lemon",28);
		StudentAge.put("Sohana",35);
		StudentAge.put("Sonia",60);
		StudentAge.put("Fatima",40);
		System.out.println("Student Age:   "+StudentAge.get("Lemon"));
	
		// HasSet : Store inorder collection containing unique value, implementation of set interface.
	
		HashSet<String> car = new HashSet<String>(); 
		car.add("Tesla");
		car.add("Toyota");
		car.add("Audi");
		car.add("BMW");
		System.out.println("Hash value:   "+car);
	}
	

}
