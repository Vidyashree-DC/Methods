package com.Xworkz.Methods;

public class BillGenerator {
	public static int calculateBillAmount(int price, int quantity) {
		int totalBillAmount = price * quantity;
		return totalBillAmount;
	}

	public static void main(String[] args) {

		int price = 300;
		int quantity = 6;
		int totalAmount;
		totalAmount = BillGenerator.calculateBillAmount(price, quantity);

		System.out.println(totalAmount);
	}

}
