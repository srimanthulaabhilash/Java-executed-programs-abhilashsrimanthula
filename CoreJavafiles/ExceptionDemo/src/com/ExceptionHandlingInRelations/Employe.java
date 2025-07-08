package com.ExceptionHandlingInRelations;

public class Employe extends Manager {
	@Override
	public
	void methodManger1(int a, int b) {
		System.out.println("parent method manager");
		// if parent method has an exception then child has no exception it is vaild
		// while overiding
	}

	@Override
	public
	void methodManger2() throws ArrayIndexOutOfBoundsException {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(arr[4]);

	}

	public static void main(String[] args) {
		Employe employe = new Employe();
		employe.methodManger1(2, 0);
		try {
			employe.methodManger2();
		} catch (Exception e) {
			System.out.println(" exception caught at "+e);
		}

	}

}
