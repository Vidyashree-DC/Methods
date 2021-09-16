package com.Xworkz.Methods;

public class Pharmacy {
	public static int pharmacyBill(int Tabletsbill, int Syrupbill, int Creambill) {

		int totalBill = Tabletsbill + Syrupbill + Creambill;
		return totalBill;

	}

	public static void main(String[] args) {

		int Tabletsbill = 500;
		int Syrupbill = 200;
		int Creambill = 100;
		int totalBill = Pharmacy.pharmacyBill(Tabletsbill, Syrupbill, Creambill);

		System.out.println("Pharmacy bill is : " + totalBill);
	}
}
