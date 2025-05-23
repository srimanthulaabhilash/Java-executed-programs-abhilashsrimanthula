package com.TaskOnnestedInner;
//1.Create an outer class Outer with an inner class Inner that prints a message. In the main method, 

//instantiate the Outer class and then create an instance of the Inner class to display the message

public class Outer {

	class Inner {
		void innermethod() {
			System.out.println("Inner method");
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innermethod();
	}

}
