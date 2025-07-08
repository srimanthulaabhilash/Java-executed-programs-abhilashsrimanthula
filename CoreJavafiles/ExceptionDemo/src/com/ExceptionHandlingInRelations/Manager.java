package com.ExceptionHandlingInRelations;

public class Manager {
	public void methodManger1(int a, int b) throws ArithmeticException {
		int c = a % b;
		System.out.println("parent method manager" + c);
	}

	public void methodManger2() {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(arr[4]);

	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		try {
			manager.methodManger1(2, 0);
		} catch (Exception e) {
			System.out.println("The exception is :" + e);
		}

		manager.methodManger2();

	}
}
