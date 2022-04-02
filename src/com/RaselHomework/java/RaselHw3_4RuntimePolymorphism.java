package com.RaselHomework.java;
/* Problem 4.	Write a java program that explains runtime polymorphism. */
public class RaselHw3_4RuntimePolymorphism {

	public static void main(String[] args) {
		
		RaselHw3_4RuntimePolymorphism v1= new RaselHw3_4RuntimePolymorphism();
		v1.wheels();
		System.out.println("Run-Time PolyMorphism ->");
		RaselHw3_4RuntimePolymorphism v2 = new Truck();
		v2.wheels();
		RaselHw3_4RuntimePolymorphism v3 = new CarTesla();
		v3.wheels();
		RaselHw3_4RuntimePolymorphism v4= new Bike();
		v4.wheels();
		RaselHw3_4RuntimePolymorphism v5 = new BiCycle();
		v5.wheels();

	}
void wheels(){
	System.out.println("Every vehicle have some wheels!");
}
//	private void wheels() {
//		// TODO Auto-generated method stub
//		
//	}

}
