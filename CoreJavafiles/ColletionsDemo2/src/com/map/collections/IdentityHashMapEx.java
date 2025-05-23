package com.map.collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapEx {
//	It is Exactly Same as HashMap Except the following Difference.
//	 In HashMap JVM will Use .equals() to Identify Duplicate Keys, which is Meant for
//	Content Comparison.
//	 In IdentityHashMap JVM will Use == Operator to Identify Duplicate Keys, which is Meant
//	for Reference Comparison.

	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<>();

		String key1 = new String("Java");
		String key2 = new String("Java");
		map.put(key1, "Language");
		map.put(key2, "Progaramming");

    System.out.println(map); // Output: {Java=Language, Java=Programming}}
	}
}
