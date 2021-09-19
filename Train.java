package com.Xworkz.Methods;

public class Train {
	public static String trainInformation(int Trainno, String time) {

		return " RaniCannamma Express Arrives at" + time + " train number is " + Trainno;

	}

	public static String ticketBooking(String coach, int seatnumber) {

		return coach + " coach and seat number " + seatnumber;

	}

	public static void main(String[] args) {

		String trainInformation = Train.trainInformation(102035, " 6AM");
		System.out.println(trainInformation);
		String ticketBooking = Train.ticketBooking(" C123", 50);
		System.out.println(ticketBooking);

	}
}
