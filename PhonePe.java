package com.Xworkz.Methods;

public class PhonePe {
	public static String DTHRecharge(String selectProvider, int subno, int amount) {
		return " your " + selectProvider + " subscriber number:" + subno + " is ruppes " + amount
				+ " recharged successfully";
	}
	
	public static String bookCylinder(String gastype, int consumerno) {
		return " your " + gastype + " cylinder as booked Successfully to No "+ consumerno;
	}

	public static String transferMoneyToAccount(long Accountno, String IFSCcode) {
		return " transaction is successful to the account " + Accountno;
	}
	
	public static String transferMoneyToContact(int phoneno) {
		return " transaction is successful to contact " + phoneno;
	}

	public static String donate(String NGO) {
		return " your donation for the " + NGO + " is successful";
	}
	
	public static String donteToCovidCashRelief(String covidcashreleif) {
		return " your donation for the " + covidcashreleif + " is successful";
	}

	public static String checkBankBalance(long UPIAccount, int amount) {
		return " your balance fetched successfully!! account balance is " + amount;
	}
	
	public static void main(String[] args) {

		String dthrecharge = PhonePe.DTHRecharge("dish Tv", 342768904, 1250);
		System.out.println(dthrecharge);
		System.out.println();
		
		String bookCylinder = PhonePe.bookCylinder("hp", 11422);
		System.out.println(bookCylinder);
		System.out.println();

		String moneytransfer = PhonePe.transferMoneyToAccount(123457889, "bobryhuvb");
		System.out.println(moneytransfer);
		System.out.println();
		
		String transferToContact = PhonePe.transferMoneyToContact(985623471);
		System.out.println(transferToContact);
		System.out.println();

		String donates = PhonePe.donate("Child welfare");
		System.out.println(donates);
		System.out.println();
		
		String donteToCovidCashRelief = PhonePe.donteToCovidCashRelief("COVID relief measure");
		System.out.println(donteToCovidCashRelief);
		System.out.println();

		String bankbalance = PhonePe.checkBankBalance(235656567, 10000);
		System.out.println(bankbalance);
		System.out.println();

	}
}

