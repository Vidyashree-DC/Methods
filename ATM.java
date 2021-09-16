package com.Xworkz.Methods;

public class ATM {
		
		public static void withdraw(int amount) {
			System.out.println("Amount Withdraw succesfull the amount is : " +amount);
		}

		public static void main(String[] args) {
			
			int amount = 30000;
			ATM.withdraw(amount);

		}

	}
