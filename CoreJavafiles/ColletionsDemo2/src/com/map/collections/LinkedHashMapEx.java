package com.map.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
//	It is the Child Class of HashMap.
//	 It is Exactly Same as HashMap Except the following Differences.
//	That is Insertion Order is Preserved.
//	The Underlying Data Structure is
//	Combination of Hashtable and LinkedList.
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(3, "abc");
		map.put(1, "def");
		map.put(2, "ghi");
		System.out.println(map);//Unlike Hashmap LinkedHashMap is maintain the insertion order.	

	}

}
