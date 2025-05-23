package com.Oops.HierarcalDemo;


public class HumanResource extends CommonDetails {
	int reportManagers;

	void hrDetails(int reportingManagers) {
		System.out.println("Reporting managers count is :" + reportingManagers);

	}

	public static void main(String[] args) {
		HumanResource hrObj = new HumanResource();
//		hrObj.hrDetails(3);
//		hrObj.details("sathya", "dev", 23);
//		hrObj.Exp=23;
//		hrObj.id=102;
		CommonDetails c = new HumanResource();
		c.Exp = 5;
		c.id = 103;
		c.details("ab", "Sri", 24);//==>grand parent class
	
		
		
		
		
		
		
//		c.hrDetails(4);
		hrObj.hrDetails(5);
		HumanResource HR= (HumanResource) new CommonDetails();//==>Upcasting
		
		HR.Exp=5;
		HR.id=103;
		HR.reportManagers=3;
		
	}

}
