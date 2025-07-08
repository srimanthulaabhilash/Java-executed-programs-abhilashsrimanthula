package com.Array.Linked.ListEx.Collections;

import java.util.Iterator;

import java.util.Vector;
//The Underlying Data Structure is Resizable Array ORGrowable Array.
// Insertion Order is Preserved.
// Duplicate Objects are allowed.
// Heterogeneous Objects are allowed.
// null Insertion is Possible.
// Implements Serializable, Cloneable and RandomAccess interfaces.
// Every Method Present Inside Vector is Synchronized and Hence Vector Object is
//Thread Safe.
// Vector is the Best Choice if Our Frequent Operation is Retrieval.
// Worst Choice if Our Frequent Operation is Insertion OR Deletion in the Middle.

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> strings = new Vector<String>();
//		new size = Old default size(10)*2
		strings.add("sunday");
		strings.add("Monday");
		strings.add("tuesday");
		strings.add("wednesday");
		strings.add("thrusday");
		strings.add("friday");
		strings.add("saturday");
		strings.add(null);
		strings.remove(6);
		System.out.println(strings);

		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			strings.add("weekend");

		}

	}

}
