package com.functionalintrface;

import java.util.function.Consumer;

public class ConsumerEx {
//	A Consumer in Java 8 is a functional interface from the java.util.function package.
//	It represents an operation that accepts a single input and performs some action but does not return any result.

	public static void main(String[] args) {
		Consumer<String> toUpper = (name) -> System.out.println(name.toUpperCase());
		toUpper.accept("Abhilash Srimanthula");

		Consumer<String> fintlength = (lastname) -> System.out.println(lastname.length());
		fintlength.accept("Srimanthula");

		Consumer<String> vowels = (word) -> {
			String string = word.replaceAll("[AEIOUaeiou]", "");
			System.out.println(string);
		};
		vowels.accept("Hi This is from aja");

		Consumer<String> removeT = (str) -> {
			System.out.println(str.replaceAll("[s]", ""));
		};
		removeT.accept("HI THIS IS FROM AJA");

		// andThen default method
		Consumer<String> combinedC = toUpper.andThen(removeT);
		combinedC.accept("Abhilash");
	}

}
