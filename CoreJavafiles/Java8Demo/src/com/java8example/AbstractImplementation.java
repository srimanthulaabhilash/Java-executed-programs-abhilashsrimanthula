package com.java8example;

public class AbstractImplementation {

	public static void main(String[] args) {
		FunctionalInterfaceEx ex = () -> {
			System.out.println("abstract method implementation ");
		};
		ex.functionalInterfaceMethod();

		Example example = (a, name) -> {
			System.out.println(" Hi " + a + " name is :" + name);
			return a;
		};
		example.example(0, null);
		

		Printer printer = message -> System.out.println("" + message);
		printer.print("Abhilash");
	}

}
