package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		int[] nums = { 4, 6, 12, 8, 14 };
		int maxNum = Arrays.stream(nums).min().orElseThrow();
		System.out.println(maxNum);

		int minNum = Arrays.stream(nums).max().orElseThrow();
		System.out.println(minNum);

		int sum = Arrays.stream(nums).sum();
		System.out.println(sum);

		int reduce = Arrays.stream(nums).reduce((a, b) -> a * b).getAsInt();
		System.out.println(reduce);

		long count = Arrays.stream(nums).count();
		System.out.println(count);

		IntStream un = Arrays.stream(nums).distinct();
		System.out.println(un);

		OptionalDouble average = Arrays.stream(nums).average();
		System.out.println(average);
		System.out.println("======================================");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(8);
		list.add(15);
		list.add(10);
		list.add(20);
		list.add(16);
		Integer max = list.stream().max((n1, n2) -> n1.compareTo(n2)).get();
		System.out.println(list.stream().mapToInt(n -> n.intValue()).max());
		System.out.println(max);

		Integer min = list.stream().min((n1, n2) -> n1.compareTo(n2)).get();
		System.out.println(list.stream().mapToInt(n -> n.intValue()).min());
		System.out.println(min);

		Integer sumof = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumof);

		OptionalDouble averageof = list.stream().mapToInt(Integer::intValue).average();
		System.out.println(averageof);

		Integer reduseOf = list.stream().mapToInt(Integer::intValue).reduce(2, (n1, n2) -> n1 + n2);
		System.out.println(reduseOf);

		Long countOf = list.stream().mapToInt(Integer::intValue).count();
		System.out.println(countOf);

		IntStream uniqueNum = list.stream().mapToInt(Integer::intValue).distinct();
		System.out.println(uniqueNum);

	}

}
