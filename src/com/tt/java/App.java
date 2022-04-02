package com.tt.java;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student myStudent= new Student();
		
		myStudent.firstName="Lemon";
		myStudent.LastName = "Kamruzzaman";
		myStudent.major=" Computer Programming ";
		myStudent.age= 28;
		myStudent.gpa = 4.9;
		myStudent.onprobation =false;
		
		
		Student myStudent2= new Student();
		myStudent2.firstName="Linda";
		myStudent2.LastName = "zaman";
		myStudent2.major=" Computer Programming ";
		myStudent2.age= 25;
		myStudent2.gpa = 4.9;
		myStudent2.onprobation =true;

		
		System.out.println(myStudent2.firstName);

	}

}