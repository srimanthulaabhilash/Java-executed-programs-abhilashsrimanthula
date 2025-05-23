package com.methodOverloading;

public class Parent {
	void parent(int x) {
		System.out.println("parent method");

	}

	int parentProporties(boolean land, int acres) {
		System.out.println("  land " + land + "acars of land" + acres);
		return acres;

	}

	void parentProporties(int b, int a) {
		System.out.println("  " + b);
	}

	public static void main(String[] args) {
		Parent p = new Parent();

	}
}
