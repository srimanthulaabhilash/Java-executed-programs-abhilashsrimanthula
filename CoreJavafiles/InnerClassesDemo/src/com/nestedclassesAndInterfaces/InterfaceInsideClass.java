package com.nestedclassesAndInterfaces;
/*We can declare interface inside a class
 * }
Inside class if we required multiple implements of an interface and these
implementations of relevant to a perticular class, then we should declare interface inside
a class. */

public class InterfaceInsideClass {
	interface Vehicle {
		public int getNoOfWeels();

	}

	class Bus implements Vehicle {

		@Override
		public int getNoOfWeels() {
			// TODO Auto-generated method stub
			return 6;
		}

		class auto implements Vehicle {

			@Override
			public int getNoOfWeels() {
				// TODO Auto-generated method stub
				return 0;
			}

		}

	}

}
