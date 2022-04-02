package com.tt.java;

public class NewApp {

	static GradStudents grds;

	public static void main(String[] args) {
		getStudentInfo();
		addNumber();
	}

	public static void getStudentInfo() {
		String name = grds.name;
		int age = grds.age;
		int gpa = grds.gpa;
		float weight = grds.weight;
		String major = grds.major;

		System.out.println(name);
		System.out.println(age);

		System.out.println(gpa);
	}

	public static int addNumber() {
		int x = 6;
		int y = 4;
		int sum = x + y;
		int sub = x - y;

		System.out.println("Sum of X+Y is : " + sum);
		
		
		System.out.println(sub);
		return sum;
	}
}
