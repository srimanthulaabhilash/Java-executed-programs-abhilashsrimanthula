package com.methodLocalInnerClasses;
//method local inner class

/*Sometimes we can declare a class inside a method such type of inner classes are
called method local inner classes.
 The main objective of method local inner class is to define method specific
repeatedly required functionality.
 Method Local inner classes are best suitable to meet nested method requirement.
 We can access method local inner class only within the method where we
declared it. That is from outside of the method we can't access. As the scope of
method local inner classes is very less, this type of inner classes are most rarely
used type of inner classes.*/

public class OuterTwo {
	int id = 6;
	static String s = "abhi";

	static public void m1() {

		class InnerTwo {
			public void m2(int a, int b) {
				System.out.println(a + b);
			}

			static void m3(int a, int b) {
				System.out.println(a + b);
			}

		}
		InnerTwo innerTwo = new InnerTwo();
		System.out.println(s);
		innerTwo.m2(10, 20);// if we are decliring a innerclass inside a instance method then
//		we can acess both static and nonstatic members of outer class directly 
		System.out.println(s);
//		System.out.println(id);

		innerTwo.m3(2, 55);
//		if we are decliring a innerclass inside a static method then
//		we can acess only static members of outer class .we cant acess instance members directly 
//		System.out.println(s);

	}

	public static void main(String[] args) {
		OuterTwo outerTwo = new OuterTwo();
		outerTwo.m1();
		System.out.println(outerTwo.id);

	}

}
