package com.IMPExceptions;

public class DemoOne {
	void method() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		DemoOne demoOne = new DemoOne();
		try {
//			System.out.println(2 % 0);// statemet 1
//			System.out.println(3 % 0);// statement 2
			System.out.println("Hello Abhilash");
			try {
				System.out.println("Srimanthula");
				demoOne = null;
				demoOne.method();// statement 3
//				System.out.println(3 % 0);// statement 4
			} catch (Exception e) {
				System.out.println("exception caught at " + e.getStackTrace());// statement 5
				e.printStackTrace();
			} finally {
				System.out.println("Rohit sharma hit man");// statement 6
			}
		} catch (ArithmeticException e) {
			System.out.println("exception caught " + e);// statement 7
			e.printStackTrace();
		} finally {
			System.out.println("Rohit sharma");// statement 8
		}
	}

}
