
package com.example;

// abstract methods implementation using anonymous inner class
abstract class A      {

	public abstract void show();

	public abstract void print();

	public static void main(String[] args) {

	}
}

public class Main {
	/*
	 * public void enter() { System.out.println("hi"); }
	 */
	public static void main(String[] args) {

		A obj = new A() {
			@Override
			public void show() {
				System.out.println(" in method show");

			}

			public void print() {
				System.out.println(" in method print");

			}

		};

		Main m = new Main();
		obj.show();
		obj.print();
//			m.enter();

	}

}
