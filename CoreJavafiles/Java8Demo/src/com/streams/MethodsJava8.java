package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodsJava8 {
//	Collection : if we want to represent group of objects then we should go with collections
//	Stream : if we want to prossess the collections
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(17);
		integers.add(4);
		integers.add(7);
		integers.add(10);
		integers.add(8);
		// 1)filter(boolean) : if we want to filter with some conditions with boolean
		// value the go with filter method
		List<Integer> li = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(li);
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(17);
		marks.add(4);
		marks.add(7);
		marks.add(10);
		marks.add(8);

//		2)Map(function) : it will accecpt function like function(<Integer>,<String>)
//		==>>for every object if we want to perform any operation and if we want return some object  
//		==>>for every object do some functionality and generate new object in map method
//		3)collect
		List<Integer> updatedmarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updatedmarks);

//		4)count() :to check how many objects are their in the stream then go with the count() method.
		List<Integer> studentsMarks = Arrays.asList(23, 56, 63, 35, 24, 28, 50);
		Long countOfFailedStudents = studentsMarks.stream().filter(m -> m < 35).count();
		System.out.println(countOfFailedStudents);

//		5)sort() :Inorder to sort the objects in natiral sorting order
//		default natural sorting order : internally CompareTo(o) is called. ==>> o1.compareTO(o2)
//		customizing sorting order : Comprator functional interface is used compare(o1,o2)
		List<Integer> studentsMarks1 = Arrays.asList(23, 56, 63, 35, 24, 28, 50);
		List<Integer> m = studentsMarks1.stream().sorted().collect(Collectors.toList());
		System.out.println(m);

		List<Integer> studentsMarks2 = Arrays.asList(23, 56, 63, 35, 24, 28, 50);
		List<Integer> x = studentsMarks2.stream().sorted((i1, i2) -> -i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(x);

//		sorted using Strings ==>> natural sorting order 
		List<String> list = Arrays.asList("sun", "mon", "tus", "wed", "thu", "fri", "sat");
		List<String> strings = list.stream().sorted().collect(Collectors.toList());
		System.out.println(strings);

		List<String> days = Arrays.asList("sun", "mon", "tus", "wed", "thu", "fri", "sat");
		List<String> lists = days.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(lists);

//	    min() method
		List<Integer> num = Arrays.asList(2, 4, 7, 13, 34, 12, 78, 15);
		Integer min = num.stream().min((n1, n2) -> n1.compareTo(n2)).get();
		System.out.println(min);
//		Max() method
		List<Integer> num1 = Arrays.asList(2, 4, 7, 13, 34, 12, 78, 15);
		Integer max = num1.stream().max((n1, n2) -> n1.compareTo(n2)).get();
		num1.stream().mapToInt(e -> e.intValue()).min();
		System.out.println(max);

//		forEach() : inorder to get the Elemnts without using any loops
		List<Integer> num2 = Arrays.asList(2, 4, 7, 13, 34, 12, 78, 15);
//		num2.stream().forEach(System.out::println);

//		toArray() : to convert the stream of elements in to array 
		List<Integer> list2 = Arrays.asList(3, 5, 9, 12, 3, 15);
		Integer[] x1 = list2.stream().toArray(Integer[]::new);// ==>>new constructor
		Stream.of(x1).forEach(System.out::println);
//		for (Integer integer : x1) {
//			System.out.println(integer);
//		}

//		Boxed : inorder to convert primitive to object 
		List<Integer> ab = IntStream.range(1, 9).boxed().collect(Collectors.toList());
		System.out.println(ab);

//		summaryStatistics() :convenient way to get basic statistics (like count, sum, min, max, and average)
//		from a primitive stream — such as IntStream, LongStream, or DoubleStream.
		IntStream intStream = IntStream.of(2, 3, 4, 6, 9);
		System.out.println(intStream.summaryStatistics());

//		groupingBy() : it's a very powerful collector in Java 8 used to group elements in a stream based on a classifier function.
		List<Integer> list3 = Arrays.asList(56, 78, 56, 78, 89);
		Map<Integer, Long> counts = list3.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

	}

}
