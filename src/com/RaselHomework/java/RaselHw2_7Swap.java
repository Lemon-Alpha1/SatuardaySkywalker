package com.RaselHomework.java;
/* Problem7. You are given two integer number (a=25, b=30),  
write a program to swap them and display result on the screen. */

public class RaselHw2_7Swap {

	public static void main(String[] args) {
		mySwap();

	}
    public static void mySwap(){
    	int a = 25;
    	int b = 30;
    	int temp; 
    	temp = a;
    	a = b;
    	b = temp;
    	System.out.println("Swap value a:" +a);
    	System.out.println("Swap value b:" +b);
    }
   
    
}
