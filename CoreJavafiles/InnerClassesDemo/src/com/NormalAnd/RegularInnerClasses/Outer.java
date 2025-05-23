package com.NormalAnd.RegularInnerClasses;

public class Outer {
	static int id = 9; /* static variable */

	static void methodOne() {
		System.out.println("static method in outer class");
	}

	class Inner {
		static int id = 2;

		static void methodInner() {
			System.out.println(" method in inner class");
		}

		public static void main(String[] args) {
			/* inner.methodInner(); */
//		we cannot call inner class static variables and methods 
			System.out.println("abhilash");

		}

	}

	public static void main(String[] args) {
		Outer.methodOne();
		System.out.println(Outer.id);
		Outer outer = new Outer();
		Outer.Inner innerOne = outer.new Inner();

		System.out.println("hello");
	}

}
