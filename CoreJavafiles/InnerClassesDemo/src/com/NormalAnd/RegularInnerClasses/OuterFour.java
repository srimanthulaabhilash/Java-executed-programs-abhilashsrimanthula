package com.NormalAnd.RegularInnerClasses;
/*Accessing inner class code from static area of outer class:*/

public class OuterFour {

	class Innerfour {
		public void methodInner() {
			System.out.println("inner class method");

		}

	}

	public void methodOuter() {
		Innerfour innerfour = new Innerfour();
		innerfour.methodInner();

	}

	public static void main(String[] args) {
		OuterFour four = new OuterFour();
		four.methodOuter();

	}

}
