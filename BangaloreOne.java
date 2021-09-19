package com.Xworkz.Methods;

public class BangaloreOne {
public static void getNotifications() {
	System.out.println(" Office will be shifted to new place " + "Address will be mg reod opposit to citi bank" );
}
public static String electricityBill(String custId,int amount) {
	String confirmMessage="Electricity bill paid successfully for customerId:" + custId + " RS :" + amount ;
	return confirmMessage;
}
public static String nameUpdate(int adharno,String newname) {
	String updatedName=" New name updated successfuly for adharno : " + adharno + " is : " + newname ;
	return updatedName;
}
public static void main(String[] args) {
	System.out.println("Begining of Program");
	BangaloreOne.getNotifications();
	String confirmMessage=BangaloreOne.electricityBill("12345678",2200);
	System.out.println(confirmMessage);
	String updatedName=BangaloreOne.nameUpdate(1234569874,"Shree");
	System.out.println(updatedName);
	System.out.println("Ending of program");
}
}
