package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiExamples {

	public static void main(String[] args) {
		// 1) print 1 to 9
		System.out.println("print 1 to 9");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println("\n*********************");
		// 2) print first few elements in a stream,
		// 100 to 150 first 10 digits
		System.out.println("print first few elements in a stream");
		IntStream.range(100, 150).limit(10).forEach(System.out::print);
		System.out.println("\n********************");

		System.out.println("skip first 5 elements in a stream");
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println("\n*********************");

		// find first alphabetically sorted string in unsorted list.
		System.out.println("find first string alphabetically when given unsorted list.");
		List<String> sList = Arrays.asList("annaji", "anil", "aanand", "adhira");
		String var = sList.stream().min(Comparator.naturalOrder()).orElse("no string is available");
		System.out.println(var);
		System.out.println("\n*********************");

		// find second element alphabetically sorted string in unsorted list.
		System.out.println("find second element alphabetically sorted string in unsorted list.");
		List<String> nameList = Arrays.asList("annaji", "anil", "aanand", "adhira");
		System.out.println(nameList.stream().sorted().skip(1).findFirst().get());
		System.out.println("\n*********************");

		// stream from array - print all names starts with s in a sorted order.
		System.out.println("stream from array sort filter and print");
		String[] strArray = { "Rajesh", "Annaji", "Ravi", "Sanjana", "Ganesh", "Soumya", "Saritha" };
		Arrays.stream(strArray).filter(str -> str.startsWith("S")).sorted().forEach(System.out::print);
		System.out.println("\n*********************");

		// average of squares of an int array
		System.out.println("average of squares of an int array");
		int[] intArray = { 1, 4, 6, 4, 9 };
		System.out.println(Arrays.stream(intArray).map(i -> i * i).average().getAsDouble());
		System.out.println("\n*********************");

		// read the the text from file and filter the min 30 chars line in it.
		System.out.println("read the the text from file and filter the min 30 chars line in it.");
		try (Stream<String> stringStream = Files.lines(Paths.get("resources/quotest.txt"))) {
			// Stream<String> stringStream=Files.lines(Paths.get("resources/quotest.txt"));
			// stringStream.forEach(System.out::println);
			System.out.println("\n*********************");
			stringStream.filter(str -> str.length() >= 30).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n*********************");
		// read the text from the file and save it to list
		try (Stream<String> lines = Files.lines(Paths.get("resources/Names.txt"))) {
			List<String> names = lines.collect(Collectors.toList());
			names.stream().forEach(System.out::println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("\n*********************");
		// get the sum of integer stream (500 to 600 sum)
		System.out.println(IntStream.range(500, 600).sum());
		// same example with reducer
		System.out.println(
				// IntStream.range(500, 600).map(i->1).reduce(0,Integer::sum));
				IntStream.range(500, 600).reduce(0, Integer::sum));
		System.out.println("\n*********************");

		// print the summary statistics of an integer array
		System.out.println("12) print the summary statistics of an integer array");
		int[] intB = { 12, 45, 66, 34, 56, 23, 55, 6 };
		System.out.println(Arrays.stream(intB).summaryStatistics().getAverage());
		// ==>>IntSummaryStatistics{count=8,sum=297, min=6,average=37.125000, max=66}

		// given the list of integers find the even and odd numbers
		System.out.println("13) given the list of integers find the even and odd numbers");
		int[] evenOrOdd = { 12, 45, 66, 34, 56, 23, 55, 6 };
		Arrays.stream(evenOrOdd).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
		Arrays.stream(evenOrOdd).filter(n -> n % 2 != 0).forEach(System.out::println);

		System.out.println("Given a list of integers, find out all numbers starting with 5 using stream functions");
		List<Integer> list = Arrays.asList(55, 66, 78, 56, 89, 5, 67, 51);
		list.stream().map(n -> String.valueOf(n)).filter(e -> e.startsWith("5")).forEach(System.out::print);

		System.out.println("find duplicate elements in a given list");
		List<Integer> listdup = Arrays.asList(55, 66, 78, 56, 89, 5, 67, 51, 56, 78);
		System.out.println(listdup.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet()));

		System.out.println("print characters from the char stream");
		String str = "welcome";
		str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().forEach(e -> System.out.println("(" + e.getKey() + "," + e.getValue() + ")"));

	}

}