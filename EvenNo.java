package com.Xworkz.Methods;

public class EvenNo {
	public static void checkEven(int array[]) {
		int a[] = { 10,15,20,25,30,35,40,45,50 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		EvenNo.checkEven(null);

	}
}
