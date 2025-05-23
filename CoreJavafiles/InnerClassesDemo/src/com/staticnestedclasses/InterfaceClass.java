package com.staticnestedclasses;
/*We can declare interface inside a class
 * }
Inside class if we required multiple implements of an interface and these
implementations of relevant to a perticular class, then we should declare interface inside
a class.*/


class X {
	interface y {

	}

}

public class InterfaceClass {
	interface Vehicle {
		public int NoOfWeeles();

	}

	class Bus implements Vehicle {

		@Override
		public int NoOfWeeles() {
			return 0;
		}

	}

	class Auto implements Vehicle {

		@Override
		public int NoOfWeeles() {
			return 0;
		}

	}

	public static void main(String[] args) {

	}

}
