package com.Set.Collections;

import java.util.LinkedHashSet;
//when your requriment is to allow unique values and maintains insertion order.
import java.util.Set;

public class LinkedHashSetEx {
	// if we want to represent multiple individual objects as a single entity where
	// insertion order is preserved and duplicates are not allowed the we go for LinkedHashSet
//	The Underlying Data Structure is a
//	Combination of LinkedList and Hashtable.
//	Introduced in 1.4 Version.
//	That is Insertion Order is Preserved.
//	In General we can UseLinkedHashSet and LinkedHashMap to Develop Cache Based
//	Applications where Duplicates are Not Allowed and Insertion Order Must be Preserved

	public static void main(String[] args) {
		Set<String> languages = new LinkedHashSet<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("JavaScript");
		languages.add("Java");// Duplicates are not added
		System.out.println(languages);// Insertion order maintains

	}

}
