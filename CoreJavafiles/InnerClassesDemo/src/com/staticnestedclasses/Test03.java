package com.staticnestedclasses;
/*From the normal inner class we can access both static and non static members of
outer class but from static nested class we can access only static members of
outer class.*/

public class Test03 {
	int x = 19;
	static int y = 10;

	static class Test03Inner {
		public void methodOne() {
//			System.out.println(x);
			System.out.println(y);
		}

	}

	public static void main(String[] args) {

	}

}
