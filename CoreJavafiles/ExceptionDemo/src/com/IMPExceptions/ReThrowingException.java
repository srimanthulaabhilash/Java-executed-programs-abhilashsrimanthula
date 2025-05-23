package com.IMPExceptions;
/*Exception Propagation :
 * With in a method if an exception raised and if that method doesn't handle that
exception, then Exception object will be propagated to the caller then caller method is
responsible to handle that exceptions. This process is called Exception Propagation*/

public class ReThrowingException {
	/*
	 * Rethrowing an Exception : To convert the one exception type to another
	 * exception type , we can use rethrowing exception concept.
	 */

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
//			System.out.println("Exception" + e);
//			throw new NullPointerException();
//
		}

	}
}
