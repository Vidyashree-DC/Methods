package com.Xworkz.Methods;

public class Phonepay {
	public static void transferMoney() {
		System.out.println("Money transfered is successful!!!");
	}
	public static void electricityBill() {
		System.out.println("Electricity Bill Paid successful!!!");
	}
	public static void rechargeDTH() {
		System.out.println("DTH Reacharge Done!!!");
	}
	public static void mobileRecharge() {
		System.out.println("Mobile Recharge successful!!!");
	}
	

	public static void main(String[] args) {
		System.out.println("Login To Phonepay");
		Phonepay.transferMoney();
		Phonepay.electricityBill();
		Phonepay.rechargeDTH();
		Phonepay.mobileRecharge();
		System.out.println("Logout From Phonepay");
	}

}
