package com.optional;

import java.util.Optional;

public class OptionalEx {
//	The Optional<T> class in Java 8 is part of the java.util package and is used to handle the presence or absence of a value in a more controlled way,
//	reducing the chances of NullPointerException. It acts as a container that may or may not contain a non-null value.
	public static void main(String[] args) {

		// 1)of()
//		The get() method in the Optional<T> class is used to retrieve the value stored inside the Optional object.
//		 it should only be used when you are certain that the Optional contains a value
		Optional<String> optional = Optional.of("Abhi");
		System.out.println(optional.get());

		// 2)empty()
//		otherwise, it throws a NoSuchElementException if the Optional is empty.
		Optional<String> optional1 = Optional.empty();
//		System.out.println(optional1.get()); // NoSuchElement

		// 3) ofNullable
		Optional<String> optional2 = Optional.ofNullable("Hello");
		System.out.println(optional2.isPresent());
		System.out.println(optional2.get());
//===========================================================================================

		// methods
		Optional<String> optional3 = Optional.of("Java");

//		1)isPresent() and iEmpty()
//		The isPresent() method is used to check whether an Optional contains a non-null value.
//		It returns true if a value is present and false if the Optional is empty.
		System.out.println(optional3.isPresent());
		System.out.println(optional3.isEmpty());// alternative to isPresent

//		2)ifpresent() and ifPresentorElse()
		Optional<String> optional4 = Optional.of("Java 8");
		Optional<String> optional5 = Optional.empty();

		optional4.ifPresent(value -> System.out.println("Value : " + value));
		optional4.ifPresentOrElse(v -> System.out.println(v), () -> System.out.println("no value found"));

		optional5.ifPresent(value -> System.out.println(value));// nothing
		optional5.ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("no value found"));

//		3)filter() and map(
//		If the value meets the condition, it remains inside the Optional.
//		If the value does not meet the condition, the result is an empty Optional.
		Optional<String> optional6 = Optional.of("Abhilash");
		Optional<String> ln = optional6.filter(name -> name.length() <= 8);
		System.out.println(ln);

		Optional<Integer> optional7 = Optional.of(8);
		Optional<Integer> val = optional7.filter(num -> num % 2 != 0);
		System.out.println(val);

		// map()
		Optional<String> optional8 = Optional.of("Spring");
		System.out.println(optional8.map(String::toUpperCase));

		Optional<String> opt = Optional.of("Spring");
		System.out.println(opt.map(String::length));

		Optional<String> optional9 = Optional.empty();
		System.out.println(optional9.map(String::toLowerCase));// empty

	}

}
