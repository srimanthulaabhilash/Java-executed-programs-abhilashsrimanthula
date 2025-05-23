package com.TaskOnnestedInner;

public class OuterClass {
	private String name = "abhilash"; // Private variable which is accessible with in the class
//	 It has access to all the fields and methods of the outer class, including private members.

	private String surname = "Srimanthula";

	class Innerclass2 {
		public void inner2Method() {
			System.out.println(surname);

		}

	}

	class Innnerclass {
		public void Info() {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();// ==>> outer Object
		System.out.println(outerClass.name);

		OuterClass.Innerclass2 inner2 = outerClass.new Innerclass2();
		inner2.inner2Method();

		OuterClass.Innnerclass inner = outerClass.new Innnerclass();// ==>>Inner Object
		inner.Info();

		;
	}

}
