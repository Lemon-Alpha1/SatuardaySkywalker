package com.tt.java;

public class Class_4_Interface_Child implements Class_4_Interface{

	public static void main(String[] args){
		CLass_4_AbstractionChild obj = new CLass_4_AbstractionChild();
		obj.iDOor();
	}
public void iDOor(){
	int numDoor = 2;
	System.out.println(numDoor);
}
	
	public int iwheels(){
		int numwheel = 4;
		return numwheel;
	}	
	
	public String icolors(){
		String colors = "black";
		return colors;
	}

}


/*
 
 (parent)        	(keyword)			(child)
 class				extends				class
 Abstract class     extends 			class
 Interface			implements			class
 Interface          extends                   Interface
 
 */

