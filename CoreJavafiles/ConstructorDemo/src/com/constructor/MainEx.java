package com.constructor;

class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}

	void methodP() {

	}

}

class Child extends Parent {
	Child() {
		System.out.println("child constructor");
	}

	void methodC() {

	}

}

public class MainEx {

	public static void main(String[] args) {
		Child child = new Child();
		child.methodP();
		/*
		 * child.Parent();
		 * Parent class constructor by default won't available to the
		 * Child. Hence Inheritance concept is not applicable for constructors and hence
		 * overriding concept also not applicable to the constructors. But constructors
		 * can be overloaded.
		 * 
		 * We can take constructor in any java class including abstract class also but
		 * we can't take constructor inside interface.
		 * 
		 */

	}

}
