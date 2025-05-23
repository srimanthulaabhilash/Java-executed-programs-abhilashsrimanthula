package com.Set.Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetex {
	//when your requriment is to dont allow duplicates and insertion order not maintains and maintains some natural sorting order
	//then go with the sortedset(I)and tressSet(Implemented class)

	public static void main(String[] args) {
//		The Underlying Data Structure is Balanced Tree.
//		 Insertion Order is Not Preserved and it is Based on Some Sorting Order.
//		 Heterogeneous Objects are Not Allowed. If we are trying to Insert we will get Runtime
//		Exception Saying ClassCastException.
//		 Duplicate Objects are Not allowed.
//		
//		 Implements Serializable and Cloneable Interfaces but Not RandomAccess Interface.

		SortedSet<Integer> numbers = new TreeSet<Integer>();
		// Adding elements (TreeSet automatically sorts them in natural order)
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);// Duplicate Objects are Not allowed.
//		numbers.add(null); null Insertion is not possible
		System.out.println(numbers);

		SortedSet<Object> objects = new TreeSet<Object>();
//		objects.add("Abhi");// Heterogenous types are not allowed in TreeSet and we get run time Exception
//		objects.add(2);
//		objects.add(true);
//		System.out.println(objects);

		System.out.println("Hetrogenous types===============================");

//		If we want to allow herogenous data we have to use Comprable and comprator for Comprasion.
//		Why Doesn't TreeSet Allow Heterogeneous Data by Default?
//		✔ TreeSet relies on sorting, so elements must be comparable.
//		✔ By default, TreeSet uses natural ordering (Comparable interface).
//		✔ When trying to add heterogeneous objects (e.g., Integer and String), Java doesn't know how to compare them, leading to ClassCastException
		TreeSet<Object> objects2 = new TreeSet<Object>(new TreeSetDemo());
		objects2.add(3);
		objects2.add("Abc");
		objects2.add(true);
		System.out.println(objects2);
		System.out.println("================================");

	}

}

class TreeSetDemo implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		return o1.toString().compareTo(o2.toString());
	}

}
