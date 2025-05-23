package com.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrigtExample {
//	so we cannot add or delete while iterating through an iterator here we have CopyOnwrightArrayList
//	1)thread safe : used for muilty threaded enviormemts
//	2)it is used for frequent Read operations

//	==>>fail safe Iterators are CopyOnWriteArrayList or ConcurrentHashMap
//	fail safe Iteratoers works on the Copy on wright mechanisms
//	when ever an iterator is created , it operates on the COPY of the collection at that moment
//	 Since the iterator works on a COPY, it does not interact directly with the original collection. 
//	Thus, it avoids throwing a ConcurrentModificationException

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<String>();
		cp.add("first");
		cp.add("Second");
		cp.add("Third");
		cp.add("Four");
		cp.add(4, "five");
//		cp.remove(4);
		System.out.println("List before adding an element :" + cp);
		Iterator<String> iterator = cp.iterator();

		while (iterator.hasNext()) {
			String str = (String) iterator.next();
//			System.out.println(str);
			cp.add("six");
			System.out.println("list after iteration :" + cp);

		}
		System.out.println("list after iteration :" + cp);
		System.out.println("=============================================");

	}

}
