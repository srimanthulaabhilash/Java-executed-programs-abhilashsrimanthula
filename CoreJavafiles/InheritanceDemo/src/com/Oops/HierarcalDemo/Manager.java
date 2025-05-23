package com.Oops.HierarcalDemo;

public class Manager extends HumanResource {

	void Meetings(int noOfMeetings) {
		System.out.println("mettings of manager is :" + noOfMeetings);

	}

	public static void main(String[] args) {
		Manager m = new Manager();
		m.Exp = 3;// ==>A
		m.id = 102;// ==>A
		m.details("Anil", "ch", 29);// ==>class A(grand parent

		m.hrDetails(4);// ==>class b(parent)
		
		m.Meetings(4);//==>class C(child

	}

}
