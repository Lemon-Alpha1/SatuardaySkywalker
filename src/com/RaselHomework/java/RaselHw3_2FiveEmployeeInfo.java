package com.RaselHomework.java;
/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */
public class RaselHw3_2FiveEmployeeInfo {
	static int count = 1;
	RaselHw3_2FiveEmployeeInfo(String job,String name, int age, int salary, String address){
		System.out.println("Emplouyee Number: "+count);
		System.out.println("Employee Job Position: "+job);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee address: "+address);
		
}
	public static void main(String[] args) {
		RaselHw3_2FiveEmployeeInfo[] obj= new RaselHw3_2FiveEmployeeInfo[5];
		obj[0]=new RaselHw3_2FiveEmployeeInfo("Software Developer","Lemon", 30, 190000, "Queens");
		obj[1]=new RaselHw3_2FiveEmployeeInfo("Software Tester","Sohana",26,170000,"New Jersey");
		obj[2]=new RaselHw3_2FiveEmployeeInfo("Software Tester","Sonia",39,100000,"Jamaica");
		obj[3]=new RaselHw3_2FiveEmployeeInfo("Software Tester","Fatima",28,160000,"Jackson Heights");
		obj[4]=new RaselHw3_2FiveEmployeeInfo("Software Tester","Santoria",25,150000,"Jamaica");

	}

}
