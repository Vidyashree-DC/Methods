package com.Xworkz.Methods;

public class Amazon {
	public static void ViewProducts() {
		System.out.println("Mobile phones");
		System.out.println("Clothes");
		System.out.println("Watches");
		System.out.println("Electronic Items");
		System.out.println("Footwears");
	}
	public static void addToCart() {
		System.out.println("Cart Items are : ");
		System.out.println("Mobile phones");
		System.out.println("Clothes");
		System.out.println("Watches");
	}
	public static void order() {
		System.out.println("Order Placed successfully!!!");
	}
	
	public static void main(String[] args) {
		Amazon.addToCart();
	}
}
