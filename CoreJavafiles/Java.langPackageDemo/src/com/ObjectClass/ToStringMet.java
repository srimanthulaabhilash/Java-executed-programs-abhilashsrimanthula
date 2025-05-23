package com.ObjectClass;

public class ToStringMet {
	String Name;
	int roll_num = 01;

	ToStringMet(String Name, int roll_num) {
		this.Name = Name;
		this.roll_num = roll_num;

	}

	void display() {
		System.out.println("Name : " + Name + ", roll num :  " + roll_num);
	}

	@Override // to provide our own reprsentation we have to override toString method in our
	// class
	public String toString() {
		return "ToStringMet [Name=" + Name + ", roll_num=" + roll_num + "]";
	}
	/*
	 * In String class, StringBuffer, StringBuilder, wrapper classes and in all
	 * collection classes toString() method is overridden for meaningful string
	 * representation. Hence in our classes also highly recommended to override
	 * toString() method.
	 */

	public static void main(String[] args) {
		ToStringMet met2 = new ToStringMet("Mani", 01);
		ToStringMet met = new ToStringMet("abhi", 02);
//		met.display();
		System.out.println(met);// ==> met.toString(); it will execute the object class toStringmethod by
								// default
		System.out.println(met2.toString());
//		met2.display();
		System.out.println("=================================");

		String string = new String("ABC");
		Integer integer = new Integer(10);
		TestHashCodeToStringEx test = new TestHashCodeToStringEx();
		System.out.println(string);
		System.out.println(integer);
		System.out.println(test);

	}

}

class Test {

	public String toString() {
		return "Test";

	}

}
