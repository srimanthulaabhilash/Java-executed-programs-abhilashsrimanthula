package com.comparableAndcomprator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProblem2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(new MyComprator());
		set.add("abhilash");
		set.add("bala");
		set.add("yogesh");
		set.add("sam");
		set.add("vijay");
		set.add("rohit");
		System.out.println(set);
	}
}

class MyComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = o1.toString();
		String str2 = (String) o2;

//		return str2.compareTo(str1);
		return -str1.compareTo(str2);
	}

}
