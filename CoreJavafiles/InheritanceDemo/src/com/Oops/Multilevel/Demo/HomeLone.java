package com.Oops.Multilevel.Demo;

public class HomeLone extends Lone {

	boolean HLone(boolean hdocuments) {
		System.out.println("Home documents is :" + hdocuments);

		return true;
	}

	public static void main(String[] args) {
		HomeLone homeLone = new HomeLone();
		homeLone.fName = "pradeep";// ==> instance varibles
		homeLone.lName = "perumalla";
		homeLone.documents(true, true, true);// ==> parent method
		homeLone.HLone(false);

	}

}
