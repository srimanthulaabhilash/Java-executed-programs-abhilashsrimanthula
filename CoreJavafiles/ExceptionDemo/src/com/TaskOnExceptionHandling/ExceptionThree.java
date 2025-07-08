
//3.You have an object initialized to null, and you attempt to call a method on it. Try this and see what happens.
package com.TaskOnExceptionHandling;

public class ExceptionThree {
	void method() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		ExceptionThree exceptionThree = new ExceptionThree();
		try {
			exceptionThree = null;
			exceptionThree.method();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
