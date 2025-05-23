package com.StaticandInstanceControlFlow;

class Test2 {

	public static int x = getX();
	public int y = getY();
	public static final int z = getZ();

	static {
		System.out.println("1 static block");
	}
	{
		System.out.println("2 instance block");
	}

	Test2() {
		System.out.println("3 constructor");
	}

	private static int getZ() {
		System.out.println("4 get Z static method");
		return 30;
	}

	private int getY() {
		System.out.println("5 getY instance  method");
		return 20;
	}

	private static int getX() {
		System.out.println("6 get X static  method");
		return 10;
	}
}

public class StaticFlowEx {
	public static void main(String[] args) {
//		 Test2 t;
		// case 1: Test2 t;==> class is not loaded now
		 int a=Test2.x;
		/*
		 * case 2: int a=Test2.x;==> class loaded and output: get X method get Z method
		 * static block
		 */
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();

		/*
		 * get X method get Z method static block getY method instance block constructor
		 */
		System.out.println("END");
	}

}
