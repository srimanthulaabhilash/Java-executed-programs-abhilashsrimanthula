package com.constructor;

public class ConstructorEx {
//*****	The main Objective of the Constructor is to perform Initilization of an Object********
//	Whenever we are creating an object some piece of the code will be executed
//	automatically to perform initialization of an object this piece of the code is
//	nothing but constructor.
	String Name;
	int rollNum;

	ConstructorEx(String Name, int rollNum) {
		this.Name = Name;
		this.rollNum = rollNum;
//		System.out.println("name : " + Name + "  rollNum :" + rollNum);

	}
	void Display() {
		System.out.println("name : "+Name +"rollNum :"+rollNum);
	}

	public static void main(String[] args) {
		ConstructorEx constructorEx = new ConstructorEx("abhi", 01);
		ConstructorEx constructorEx2 = new ConstructorEx("Akhi", 02);
		constructorEx2.Display();

	}

}
