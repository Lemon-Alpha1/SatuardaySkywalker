package com.rasel.java;

public class Class_4Encapsulation {
	// Encapsulation used to hide the data using setter and getter method
	
	private int ssn = 456123;   // Read and write only
	private int password = 123652; // write only
	private String username = "Lemon"; // read only
	
	
	//Setter method-- set the data
	public void setSSN(int value){
		ssn= value;
		
	} 
	
	public void setpassword (int value){
		password = value;
	}
	
	//Getter method-- get the data
	
	public int getSSN(){
		return ssn;
		
	}
	
	public String getusername(){
		return username;
		
	}
}	
	
class testEncapsulation{	
	public static void main(String[] args) {
		Class_4Encapsulation objparent= new Class_4Encapsulation();
		System.out.println(objparent.getSSN());
		
		
	}

}
