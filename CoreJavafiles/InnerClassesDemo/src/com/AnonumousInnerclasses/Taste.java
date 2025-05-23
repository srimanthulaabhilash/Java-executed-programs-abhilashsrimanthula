package com.AnonumousInnerclasses;

/*Sometimes we can declare inner class without name such type of inner classes
are called anonymous inner classes.
 The main objective of anonymous inner classes is "just for instant use".
There are 3 types of anonymous inner classes
1. Anonymous inner class that extends a class.
2. Anonymous inner class that implements an interface.
3. Anonymous inner class that defined inside method arguments*/
class Popcorn {
	void method() {
		System.out.println("salty");
	}

}

public class Taste {
	public static void main(String[] args) {

		Popcorn popcorn = new Popcorn() {
			void method() {
				taste(); /*
							 * we can call the methods with in the classes an douside the class is not
							 * allowed
							 */
				System.out.println("spicy");

			}

			void taste() {
				System.out.println("");
			}

		};
		// Taste(); we cannot call a method of inner class from outside outside inner
		// class.

		popcorn.method();
		Popcorn popcorn2 = new Popcorn();
		popcorn2.method();

	}

}
