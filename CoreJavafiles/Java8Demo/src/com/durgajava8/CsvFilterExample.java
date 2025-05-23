package com.durgajava8;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class CsvFilterExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("students.csv");

		List<String> lines = Files.readAllLines(path);

		List<String[]> records = lines.stream().skip(1).map(line -> line.split(",")).collect(Collectors.toList());

		List<String[]> lessThanOrEqual300 = records.stream().filter(arr -> Integer.parseInt(arr[2]) <= 300)
				.collect(Collectors.toList());

		System.out.println("Records with score <= 300:");
		lessThanOrEqual300.forEach(arr -> System.out.println(Arrays.toString(arr)));

		Map<String, String> greaterThan300 = records.stream().filter(arr -> Integer.parseInt(arr[2]) > 300)
				.collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));

		System.out.println("\nRecords with score > 300 (name -> grade):");
		greaterThan300.forEach((name, grade) -> System.out.println(name + " -> " + grade));
	}
}
