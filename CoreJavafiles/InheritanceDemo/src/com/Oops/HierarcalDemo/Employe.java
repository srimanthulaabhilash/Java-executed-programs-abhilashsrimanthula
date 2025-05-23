package com.Oops.HierarcalDemo;

public class Employe extends CommonDetails {
	void employeDetails(String itDomain, String reportManager) {
		System.out.println("It Domain IS :" + itDomain + "reporting manager is :" + reportManager);

	}

	public static void main(String[] args) {
		Employe employeObj = new Employe();
		employeObj.details("abhilash", "Srimanthula", 24);
		employeObj.employeDetails("java", "Ramya");
		employeObj.Exp=15;
		employeObj.id=103;
		System.out.println("experince is "+employeObj.Exp+"Employee id is :"+employeObj.id);
	}

}
