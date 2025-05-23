package com.Oops.Multilevel.Demo;

public class PersonalLone extends Lone {

	boolean Pdocuments(boolean Pdoc) {
		System.out.println("personal documents " + Pdoc);
		return true;

	}

	public static void main(String[] args) {
		PersonalLone plone = new PersonalLone();
		plone.fName = "vijay";
		plone.lName = "pusala";
		plone.documents(false, true, true);// ==>parent method
		plone.Pdocuments(true);// ==> self method

	}

}
