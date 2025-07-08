package com.comparableAndcomprator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProblem {
//	Write a Program to Insert Integer Objects into the TreeSet where Sorting Order is Descending
//	Order:
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyCompratorEx());
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(5);
		set.add(20);
		set.add(20);
		System.out.println(set);
	}
//	At Line 1 if we are Not Passing Comparator Object as an Argument then Internally JVM
//	will Call compareTo(). Which is Meant for Default Natural Sorting Order (Ascending
//	Order). In this Case the Output is [0, 5, 10, 15, 20].

//	 At Line 1 if we are Passing Comparator Object then JVM will Call compare() Instead of
//	compareTo(). Which is Meant for Customized Sorting (Descending Order). In this Case the
//	Ouput is [20, 15, 10, 5, 0].
}

class MyCompratorEx implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else

			return 0;
	}
}
//	@Override
//	public int compare(Object obj1, Object obj2) {
//		Integer i1 = (Integer) obj1;
//		Integer i2 = (Integer) obj2;
//
//		return i1.compareTo(i2);
//		return -i1.compareTo(i2);
//		return i2.compareTo(i1);
//		return -i2.compareTo(i1);
//		return -i1;
//		return i1;
//		return 0;
//
//	}
//
//}
