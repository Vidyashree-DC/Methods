package com.Xworkz.Methods;

public class WebsiteLogin {
	public static boolean logIn(String userName, String password) {
		boolean Login;
		String name = "vidyashree";
		String pswd = "25463";

		if (userName == name && password == pswd) {
			Login = true;
		} else {
		Login = false;
		}
return Login;
	}

	public static void main(String[] args) {

		System.out.println(WebsiteLogin.logIn("vinu", "52364"));
	}

}
