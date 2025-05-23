package com.accessmodifiers;
/*The applicable modifiers for outer classes are:*/

public /* default ,abstract,final,strictfp */ class Outer {
	
	/*But for the inner classes in addition to this the following modifiers also allowed.*/
	private /* protected ,final ,abstract ,strictfp */class Inner {
		void methodInner() {
			System.out.println("inner method");

		}

	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.methodInner();

	}

}
