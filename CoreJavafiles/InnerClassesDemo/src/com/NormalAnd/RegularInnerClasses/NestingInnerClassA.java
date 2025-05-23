package com.NormalAnd.RegularInnerClasses;

public class NestingInnerClassA {
	class B {
		class C {
			public void methodC() {
				System.out.println("method in class C");
			}

		}

	}

	public static void main(String[] args) {
		NestingInnerClassA a = new NestingInnerClassA();
		NestingInnerClassA.B b = a.new B();
		B.C c = b.new C();
		c.methodC();

	}

}
