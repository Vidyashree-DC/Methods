package com.Xworkz.Methods;

public class TollGate {
	public static void tollgateOpen() {
		System.out.println("Tollgate Opened ");
	}
	public static void collectTheMoney() {
		System.out.println("Paid Money ");
	}
	public static void tollgateClose() {
		System.out.println("Tollgate Closed : ");
	}
	public static void main(String[] args) {
		System.out.println("entry the tollgate");
		TollGate.collectTheMoney();
		TollGate.tollgateOpen();
		System.out.println("exit te tollgate");
		TollGate.tollgateClose();
	}
}
