package com.Oops.Multilevel.Demo;

public class EducationalLone extends Lone {

	boolean Edocuments(boolean Edoc) {
		System.out.println("Educational doc is " + Edoc);
		return true;
	}

	public static void main(String[] args) {
		
		

		EducationalLone educationalLone = new EducationalLone();
		educationalLone.fName = "abhi";// ==>instance variables
		educationalLone.lName = "Sriam";
		educationalLone.documents(true, true, true);// ==>parent method
		educationalLone.Edocuments(true);// ==> self method
		
	}

}
