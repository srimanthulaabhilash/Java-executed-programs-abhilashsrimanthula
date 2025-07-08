package com.map.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	// map is the not child interface of collection interface
//	if you want to go with group of objects with key and value pair then go with the map
//	map is the collection of entry objects
	// we cannot use collections methods
//	Map is Not Child Interface of Collection.
//	 If we want to Represent a Group of Objects as Key- Value Pairs then we should go for Map.
//	 Both Keys and Values are Objects Only.
//	 Duplicate Keys are Not allowed. But Values can be Duplicated.
//	 Each Key- Value Pair is Called an Entry.

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		Map<Integer, String> hashMap2 = new HashMap<Integer, String>();

		hashMap.put(01, "balu");
		hashMap.put(02, "ram");
		hashMap.put(03, "krishna");
		hashMap.put(01, "Abhilash");// it will no allow duplicates keys but it allow duplicate
									// values
//		in this for 01 key the updated value is Abhilash not balu it returns the "balu"
		System.out.println(hashMap);
		hashMap2.putAll(hashMap);
		System.out.println("The copy of HashMap : " + hashMap2); // Copying all elements from hashmap2 to hashmap1

		System.out.println("the valu of key 2 :" + hashMap.get(02));// to get only key value
		System.out.println("removes the totao entry of the map : " + hashMap.remove(1));// it removes the total entry of
																						// map
		System.out.println("Is key is present or not : " + hashMap.containsKey(1));// it checks weather the key is
																					// present or not
		System.out.println("Is the value is present or not : " + hashMap.containsValue("ram"));// it checks weather the
																								// key is present or not
		System.out.println("Itarate over key value pair=============================");
		Iterator<Integer> keyiterator = hashMap.keySet().iterator();
//		in order to get the keys of the map
		while (keyiterator.hasNext()) {
			Integer i = keyiterator.next();
			System.out.println("keys  :" + i);
		}

		Iterator<String> valueiterator = hashMap.values().iterator();
//		in order to get the values of the map
		while (valueiterator.hasNext()) {
			System.out.println("values :" + valueiterator.next());

		}

		Iterator<Entry<Integer, String>> keyvalueiterator = hashMap.entrySet().iterator();
//		in order to get the keys and values of the map
		while (keyvalueiterator.hasNext()) {
			System.out.println("key and values :" + keyvalueiterator.next());

		}

	}

}
