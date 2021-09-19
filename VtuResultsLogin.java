package com.Xworkz.Methods;

public class VtuResultsLogin {
	public static String result(String Usn ,int percentage ) {
		
		   return  "your total percentage is "+percentage;
		     
       }
	public static void main(String[] args) {
		
	String result = VtuResultsLogin.result("1mm2200", 70);
	System.out.println(result);
	}
}

