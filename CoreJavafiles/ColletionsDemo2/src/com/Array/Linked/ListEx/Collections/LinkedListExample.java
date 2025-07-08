package com.Array.Linked.ListEx.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
//Uses a doubly linked list as its internal data structure.
//Each element (node) contains a reference to the next node  and the previous node.
//
// The Underlying Data Structure is Double LinkedList.
// Insertion Order is Preserved.
// Duplicate Objects are allowed.
// Heterogeneous Objects are allowed.
// null Insertion is Possible.
// Implements Serializable and Cloneable Interfaces but Not RandomAccessInterface.
// Best Choice if Our Frequent Operation is InsertionOR Deletion in the Middle.
// Worst Choice if Our Frequent Operation is Retrieval

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.set(2, 6);
		linkedList.get(0);
//		System.out.println(linkedList.get(3));

		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Integer y = iterator.next();
			System.out.println(y);
			linkedList.add(8);// fail fast iterator ==>> we cannot add or remove an element while iterating
								// through the Array list and LinkedList
//			where we can get ConcurrentModificatiionException
		}

	}

}
