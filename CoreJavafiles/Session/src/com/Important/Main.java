package com.Important;

public class Main implements FunctionalInterfaceEx {

	@Override
	public void functionalInterfaceMethod() {
		System.out.println("functionalInterfaceMethod");
	}

	public static void main(String[] args) {
		Example example = new Example() {

			@Override
			public int example(int a, String name) {
				System.out.println("Example implementation");
				return 0;
			}
		};

		Printer printer = (str) -> {
			System.out.println("print implemention");

		};
	}

}
