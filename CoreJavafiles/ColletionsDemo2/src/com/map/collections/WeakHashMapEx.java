package com.map.collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapEx {
//	It is Exactly Same as HashMap Except the following Difference.
//	 In Case of HashMap, HashMap Dominates Garbage Collector. That is if Object doesn’t
//	have any Reference Still it is Not Eligible for Garbage Collector if it is associated with
//	HashMap.
//	 But In Case of WeakHashMap if an Object doesn't contain any References then it is Always
//	Eligible for GC Even though it is associated with WeakHashMap. That is Garbage Collector
//	Dominates WeakHashMap.

	public static void main(String[] args) {
		Map<Object, String> weakMap = new WeakHashMap<Object, String>();
		Object key1 = new Object();
		Object key2 = new Object();

		weakMap.put(key1, "Value 1");
		weakMap.put(key2, "Value 2");

		System.out.println("Before GC: " + weakMap);

		// Remove strong reference
		key1 = null;
		key2 = null;

		// Request garbage collection
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // Give some time for GC to run

		System.out.println("After GC: " + weakMap); // Entries removed

	}

}
