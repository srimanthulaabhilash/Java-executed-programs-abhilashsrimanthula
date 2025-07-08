package com.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentEx {

	public static void main(String[] args) {
//		Need for Concurrent Collections

//		Tradition Collection Object (Like ArrayList, HashMapEtc) can be accessed by Multiple
//		Threads simultaneously and there May be a Chance of Data Inconsistency Problems and
//		Hence these are Not Thread Safe.

//		 Already existing Thread Safe Collections (Vector, Hashtable, synchronizedList(),
//		synchronizedSet(), synchronizedMap() ) Performance wise Not Upto the Mark.

//		 Because for Every Operation Even for Read Operation Also Total Collection will be loaded
//		by Only One Thread at a Time and it Increases waiting Time of Threads.

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(9);
		Iterator<Integer> iterable = arrayList.iterator();
		while (iterable.hasNext()) {
			Integer s = iterable.next();
			System.out.println(s);
//			arrayList.add(9);//==>> ConcurrentCollectionException

		}

//		Another Big Problem with Traditional Collections is while One Thread iterating Collection,
//		the Other Threads are Not allowed to Modify Collection Object simultaneously if we are
//		trying to Modify then we will get ConcurrentModificationException.

//		 Hence these Traditional Collection Objects are Not Suitable for Scalable Multi Threaded
//		Applications.

//		 To Overcome these Problems SUN People introduced Concurrent Collections in 1.5 Version.
		
//		1) Concurrent Collections are Always Thread Safe

//		2) When compared with Traditional Thread Safe Collections Performance is More because of
//		different Locking Mechanism.
		
//		3) While One Thread interacting Collection the Other Threads are allowed to Modify
//		Collection in Safe Manner.
		
//		Hence Concurrent Collections Never threw ConcurrentModificationException.
//		1)ConcurrentHasMap
// 		2)CopyOnWrightArrayList
//		3)CopyOnwrightArraySet

	}

}
