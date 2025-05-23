package com.java8example;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> Isevenodd = (num) -> {
			if (num != 0 && num % 2 == 0) {
				return true;
			}
			return false;
		};
		System.out.println(Isevenodd.test(6));

		Predicate<Integer> notPrime = (e) -> {
			for (int i = 2; i <= (e / 2) + 1; i++) {
				if (e % i == 0)
					return true;
			}
			return false;
		};

		Predicate<Integer> even = (e) -> {
			return e % 2 == 0 ? true : false;
		};
		if (notPrime.and(even).test(9)) {
			System.out.println("it is prime number and/or odd");
		} else {
			System.out.println("not prime and not even");
		}
	}

}
