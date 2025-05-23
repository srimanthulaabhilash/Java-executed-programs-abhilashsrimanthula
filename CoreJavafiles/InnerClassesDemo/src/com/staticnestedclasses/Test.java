package com.staticnestedclasses;
/*Sometimes we can declare inner classes with static modifier such type of inner
classes are called static nested classes.
 In the case of normal or regular inner classes without existing outer class object
there is no chance of existing inner class object.
i.e., inner class object is always strongly associated with outer class object.
 But in the case of static nested class without existing outer class object there may
be a chance of existing static nested class object.
i.e., static nested class object is not strongly associated with outer class object

*Inside static nested classes we can declare static members including main()
method also. Hence it is possible to invoke static nested class directly from the
command prompt.*/

public class Test {
	public void name() {
		System.out.println("outer class");

	}

	static class Nested {
		void methodtest() {
			System.out.println("nested class method");
		}

		public static void main(String[] args) {
			Test.Nested nested = new Test.Nested();
			nested.methodtest();

		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.name();
//		Nested.main(args);
//		Test.Nested nested=test.new Nested();
//		Test.Nested nested2 = new Test.Nested();

	}

}
