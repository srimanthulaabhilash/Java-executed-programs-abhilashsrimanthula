package com.functionalintrface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isWholeNum = (num) -> {
			return num == 0;

		};
		System.out.println(isWholeNum.test(0));

		Predicate<Integer> isEven = (num) -> {
			if (num != 0 & num % 2 == 0) {
				return true;
			}
			return false;
		};
		System.out.println(isEven.test(8));

		Predicate<Integer> isPrime = (number) -> {
			for (int i = 2; i <= (number / 2) + 1; i++) {
				if (number % i == 0)
					return true;
			}
			return false;
		};
		System.out.println(isPrime.test(9));

		if (isEven.and(isPrime).and(isWholeNum).test(9)) {
			System.out.println("Even , whole and prime ");

		} else
			System.out.println("not even and not prime");

		// And default method
		Predicate<Integer> combinedand = isPrime.and(isEven);
		System.out.println(combinedand.test(6));

		// OR default method
		Predicate<Integer> combinedor = isPrime.or(isEven);
		System.out.println(combinedor.test(8));

		// nagate default method
		Predicate<Integer> isOdd = isEven.negate();
		System.out.println("Is odd : " + isOdd.test(8));

		// isEqual static method
		Predicate<String> isAbhi = Predicate.isEqual("Abhi");
		System.out.println(isAbhi.test("Abhi"));
		System.out.println(isAbhi.test("srimanthula"));
		System.out.println(isAbhi.test("abhi"));

		// Not static method java 11

	}
}
