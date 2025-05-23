package com.java8example;

//@FunctionalInterface
public interface FunctionalInterfaceEx /* extends */ {
	public void functionalInterfaceMethod();
	/*
	 * An interface which is having only one abstract method is called functional
	 * interface. If an interface extends another interface and is having any
	 * abstract methods is also a count then the num of abstract methods is : 2
	 * 
	 * 1)runnable 2)callable<T> 3)camprable<T> 4)cloneable 6)Comparator<T>
	 * 7)Consumer<T>
	 */

	public default void methodA() {

	}

	public static void methodB() {

	}

}

interface Example {
	public int example(int a, String name);

}

interface Printer {
	public abstract void print(String str);
}
