package com.comparableAndcomprator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProblem3 {
	/*
	 * Write a Program to Insert String and StringBuffer Objects into the TreeSet
	 * where Sorting Order is Increasing Length Order. If 2 Objects having Same
	 * Length then Consider their Alphabetical Order:
	 */

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyClass());
		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AA"));
		treeSet.add(10);
		treeSet.add("XX");
		treeSet.add("ABCDE");
		treeSet.add(20);
		treeSet.add(true);
		System.out.println(treeSet);
		/*
		 * If we are Depending on Default Natural Sorting Order Compulsory Objects
		 * should be Homogeneous and Comparable Otherwise we will get RE:
		 * ClassCastException. ==>> If we defining Our Own Sorting by Comparator then
		 * Objects Need Not be Homogeneous and Comparable. That is we can Add
		 * Heterogeneous Non Comparable Objects to the TreeSet.
		 */
		StringBuffer buffer=new StringBuffer();
	}
}

class MyClass implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return +1;
		} else
			return s1.compareTo(s2);
	}

}
