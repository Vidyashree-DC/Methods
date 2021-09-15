package com.Xworkz.Methods;

public class AirConditioner {
	public static void onAC() {
		System.out.println("Turn on The AC ");
	}
	public static void increaseACTemparature() {
		System.out.println("Increase the AC Temparature");
	}
	public static void decreaseACTemparature() {
		System.out.println("Decrease the AC Temparature ");
	}
	public static void offAC() {
		System.out.println("Turn off The AC");
	}
	public static void main(String[] args) {
		AirConditioner.onAC();
		AirConditioner.increaseACTemparature();
		AirConditioner.decreaseACTemparature();
		AirConditioner.offAC();

	}

}
