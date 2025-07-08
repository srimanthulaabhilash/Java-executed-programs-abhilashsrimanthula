package com.IMPExceptions;

public class DemoTwo {
	void method1() {
		System.out.println("abhi");
	}
	String s="ab";

	public static void main(String[] args) {
		DemoTwo demoTwo = new DemoTwo();
		demoTwo = null;
		try {
			System.out.println("hello");
			
		}finally {//try with finally exists
			System.out.println("abhilash");
			
		}

		try {
			System.out.println(2 % 0);
		} catch (Exception e) {
			System.out.println("Exception caught"+e);
//			demoTwo.method1();

		} finally {
			System.out.println("rohit sharma");
//			System.out.println(8 % 0);// abnormal termination
		}
		
	}

}
