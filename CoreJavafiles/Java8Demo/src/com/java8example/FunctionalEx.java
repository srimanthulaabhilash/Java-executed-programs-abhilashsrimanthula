package com.java8example;

public interface FunctionalEx extends FunctionalInterfaceEx, ABC {

	default void MethodA() {
		System.out.println("defult method");
	}

	static void methodB() {
		System.out.println("static method");
	}

}

interface ABC {

}
