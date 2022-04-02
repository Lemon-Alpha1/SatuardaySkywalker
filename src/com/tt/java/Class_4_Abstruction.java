package com.tt.java;

public abstract class Class_4_Abstruction {
// Abstract Class can have both abstract method and regular methods.
	
	
	//Regular or non abstract method---
	public int age(){  // return method
			return 30;
		}

		
		public void name(){ // void method
			String name= "Lemon";
		}
		
		
		// Abstract method: Abstraction method is a method that is declared, but contains no implementation.
		public abstract void iDOor();
		public abstract int iwheels();
		public abstract String icolors();
		
	}


