package com.java8example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReferenceEx {
	public static void Display(String message) {
		System.out.println(message);
	}

	public void Print(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		String[] names = { "Java", "Hibernate", "Springboot" };
		Arrays.stream(names).forEach(ReferenceEx::Display);

		ReferenceEx ex = new ReferenceEx();
		Arrays.stream(names).forEach(ex::Print);

		Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);

		// ====================

		List<String> list = Arrays.asList("java", "spring", "boot");

		List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upperList);

	}

}
