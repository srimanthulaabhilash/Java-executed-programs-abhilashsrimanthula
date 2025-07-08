package com.methodLocalInnerClasses;
/*If we declare methodOne() method as static then we will get compile time error
saying "non-static variable x cannot be referenced from a static context".
.*/

/* In method the local varibles are by default final and we cant change values of varibles */

public class OuterOne {
	int id = 1000;
	static String name = "Abhilash";

	void methodOuter() {
		int age = 24;
		class Inner {

			void methodInner() {
				System.out.println("inner method");
				System.out.println(id);
				System.out.println(name);
				System.out.println(age);
			}

		}
		Inner inner = new Inner();
		inner.methodInner();

	}

	public static void main(String[] args) {
		OuterOne one = new OuterOne();
		one.methodOuter();
//		new OuterOne().methodOuter();
	}

}
