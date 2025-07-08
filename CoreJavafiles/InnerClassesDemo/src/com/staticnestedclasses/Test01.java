package com.staticnestedclasses;

/*From the normal inner class we can access both static and non static members of
outer class but from static nested class we can access only static members of
outer class.*/

public class Test01 {
	void methodT() {
		System.out.println("methodT");
	}

	static class Testinner {
		void methodtestinner() {
			System.out.println("methodTestInner");
		}

		public static void main(String[] args) {
			Testinner testinner = new Testinner();
			testinner.methodtestinner();
		}

	}

	public static void main(String[] args) {
		Test01 test01 = new Test01();
		test01.methodT();

	}

}
