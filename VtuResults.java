package com.Xworkz.Methods;

public class VtuResults {
	public static double result(String Usn) {
		String myUsn="1MM21CS130";
		if(Usn==myUsn) {
		 double result=71.2;
		 return result;
		}
		else {
			System.out.println("INVALID USN");
		}
		return 0;   
       }
	public static void main(String[] args) {
		/*double result = VtuResults.result("1MM21CS130");
		System.out.println(result);*/
		double result1 = VtuResults.result("1MM21CS13");
		System.out.println(result1);
	}
}
