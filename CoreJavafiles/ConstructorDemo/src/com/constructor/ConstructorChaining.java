package com.constructor;
/*Constructor chaining refers to the process of invoking one constructor
 *  from another within the same class or from a constructor in the parent class
 *  
 *  A constructor calls another constructor in the same class using the this() keyword.
 *  
 *  A constructor in a child class calls a constructor in the parent class using the super() keyword.*/

public class ConstructorChaining {

	ConstructorChaining() {

		this(1, "abhi");

		System.out.println("No arg constructor");

	}

	ConstructorChaining(int num, String name) {
		this(2, 4, "srimanthula");
		System.out.println("two arg constructor");

	}

	ConstructorChaining(int x, int z, String y) {
		System.out.println("three arg constructor");

	}

	public static void main(String[] args) {
		ConstructorChaining chaining = new ConstructorChaining();

	}

}
