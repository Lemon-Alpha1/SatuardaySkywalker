package com.RaselHomework.java;

public class RaselHw3_3BanksInterestRate {
	void displayInterestRate(){
		System.out.println("Default Interest rate is NONE");
	}

	public static void main(String[] args) {
		
		RaselHw3_3BanksInterestRate obj = new ChaseBank();
		obj.displayInterestRate();
		new CityBank().displayInTerestRate();
		new TDBank().displayInTerestRate();
		new BankOfAmerica ().displayInterestRate();
	}

}
