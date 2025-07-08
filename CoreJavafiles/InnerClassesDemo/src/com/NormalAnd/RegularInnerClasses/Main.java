package com.NormalAnd.RegularInnerClasses;
//Acession inner class code from the outside of outer class

class Outer0 {
	int id = 7;
	static String name = "abhi";

	public void methodOuter() {
		System.out.println("method in Outer class");
	}

	class Inner0 {

		public void methodInner() {
			System.out.println("method in inner class");
		}

		public static void main(String[] args) {
		}

	}
}

public class Main {
	public static void main(String[] args) {
		new Outer0().new Inner0().methodInner();// ==>>creating object and calling the inner method
	}

}
