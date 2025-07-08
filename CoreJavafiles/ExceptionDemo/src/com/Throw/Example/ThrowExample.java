package com.Throw.Example;

public class ThrowExample {
	void agevalidation(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("age must be greater than 18");
		}
		System.out.println("your are  eligble to thiz ");

	}

	public static void main(String[] args) {
		ThrowExample example = new ThrowExample();
		try {

			example.agevalidation(12);
		} catch (Exception e) {
			System.out.println("exception caught  ");

		}

	}

}
