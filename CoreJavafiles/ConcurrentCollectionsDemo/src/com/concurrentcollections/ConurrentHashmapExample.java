package com.concurrentcollections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConurrentHashmapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
//		System.out.println("map before iterate " + map);
		Iterator<Integer> keyiterator = map.keySet().iterator();
//		in order to get the keys of the map
		while (keyiterator.hasNext()) {
			Integer i = keyiterator.next();
//			System.out.println(i);
			map.put(5, "five");
//			System.out.println(i);

		}
		System.out.println("the arraylist after iteration :" + map);

		System.out.println("=======================================");
		Iterator<String> iterator1 = map.values().iterator();
//		in order to get the values of the map
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());

		}
		System.out.println("========================================");
		Iterator<Entry<Integer, String>> iterator2 = map.entrySet().iterator();
//		in order to get the keys and values of the map
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
		System.out.println("=========================================");

		for (Integer key : map.keySet()) {
			System.out.println(key + " the value is :" + map.get(key));
			if (key == 1) {
				map.put(5, "five");

			}
//			System.out.println(map);

		}
		System.out.println(map);
	}

}
