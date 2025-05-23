package com.java8example;

public abstract class AbstractEx extends PredicateEx /* ,SupplierEx */ {
//	default void methodA() {
//   No default methods in the abstract class
//	}
	public void concreatMethod() {
		System.out.println("concrete method");
	}

	static void methodB() {
		System.out.println("Abstract class have static methods");
	}

	public static void main(String[] args) {

	}

}
