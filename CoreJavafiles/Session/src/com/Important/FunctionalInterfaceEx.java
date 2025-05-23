package com.Important;

@FunctionalInterface
public interface FunctionalInterfaceEx {
	public void functionalInterfaceMethod();

	public default void methodA() {

	}

	public static void methodB() {

	}

}

@FunctionalInterface
interface Example {
	public int example(int a, String name);

}

@FunctionalInterface
interface Printer {
	public abstract void print(String str);
}
