package com.java8example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 3, 5, 2, 7, 5, 6, 7, 9);

		Map<Integer, Long> duplicatesCount = integers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		duplicatesCount.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(
				entry -> System.out.println(entry.getKey() + " -> duplicated " + (entry.getValue() - 1) + " times"));
	}

}
