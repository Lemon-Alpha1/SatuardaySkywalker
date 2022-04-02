package com.RaselHomework.java;

/* Problem6. Write a java program to find the prime number from 1 to 100 and print them.*/
public class RaselHw2_6PrimeNumber {

	public static void main(String[] args) {
		myPrimeNumber();

	}
    public static void myPrimeNumber(){
    	int upperbound = 100;
    	for (int number = 2; number <= upperbound; ++number){
    		
    		int maxFactor = (int) Math.sqrt(number);
    		boolean isPrime = true;
    		int factor = 2;
    		while (isPrime && factor<= maxFactor){
    			if(number % factor == 0){
    				isPrime = false;
    			}
    			++factor;
    		}
    		if(isPrime){
    			System.out.println(number + " is a prime number");
    		}
    	}
    	
    }
	
	
	
}
