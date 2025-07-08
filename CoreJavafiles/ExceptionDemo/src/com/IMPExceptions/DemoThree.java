package com.IMPExceptions;

public class DemoThree {

	public void primary(int a, int b) throws Exception {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		DemoThree demoThree = new DemoThree();
//		demoThree.primary(2, 8);
		// when you are having the exception only in method level then you have to handle
		// the exceptiopn in the calling the method
		// 1)you can handle the Exception in main method
		// 2) using try amd catch in the method calling

		try {
			demoThree.primary(2, 0);
		} catch (Exception e) {
			System.out.println("exception caught"+e);
		}
		System.out.println("hello");

	}

}
