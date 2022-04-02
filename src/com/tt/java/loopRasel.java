package com.tt.java;

public class loopRasel {

	public static void main(String[] args) {
		
		//practiceForLoop();
		//practiceForLoop();
		//practiceDoWhileLoop();
		// practiceInfinitLoop();
		 practiceNestedForLoop();
	}
	
	//for loop-- do again and again up to uppper limit
	public static void practiceForLoop(){
		int i;   // intialize variable
		for(i=1; i<10; i++){                  // set lower limikt to upper limit increemtn/decrement
			System.out.println("For Loops Number =" + i);
		}
		
	}
	//while loop
	public static void practiceWhileLoop(){
		int i = 1;
		while (i<10){
			System.out.println("while loops number ="+ i);
		}
	}
			
		//do while loop 
		public static void practiceDoWhileLoop(){
		int i=1;
		do {
			System.out.println("do whie loops number =  "+ i);
			i++;
			
			
		}while (i<10);
		
		}
	
	// infinit Loop
		public static void practiceInfinitLoop(){
		int i;
		for (i=1; ;i++){
		System.out.println("infint loops number = "+i);
	}
			}

		
		//Nested Loop
		public static void practiceNestedForLoop(){
			int i;
			int j;
			for (i=1; i<10; i++){
				for (j=1; i<5; j++)
				System.out.println("for loops Number"+ i);
			}
		}
}
