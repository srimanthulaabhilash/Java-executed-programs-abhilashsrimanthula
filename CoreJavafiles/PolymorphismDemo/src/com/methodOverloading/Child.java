package com.methodOverloading;

public class Child extends Parent {
	int childproporties(int a, int b) {// child method
		System.out.println(a + "" + b);
		return b;

	}

	@Override
	int parentProporties(boolean a, int b) {
		System.out.println("" + a + " " + b);
		return b;

	}

	
	void parent(float x) {
		System.out.println("child method");

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.parent(0);

	}

}
