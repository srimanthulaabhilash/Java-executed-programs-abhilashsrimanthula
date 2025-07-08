package com.Array.Linked.ListEx.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//1)ArrayList Uses a dynamic array or(growable array) as its internal data structure.(Underlying Data Structure)
//2)The array grows automatically when more elements are added than its current capacity
//3)It directly accesses elements based on the index because arraylist follows the continous memory allocations.
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
		arrayList.add(1);// 0
		arrayList.add(2);// 1
		arrayList.add(3);// 2
		arrayList.add(4);// 3
		arrayList.add(5);// 4
		arrayList.add(6);// 5
		arrayList.add(7);// 6
		arrayList.add(8);// 7
		arrayList.add(8, 9);// 8
		arrayList.add(10);// 9

		ListIterator<Integer> iterator = arrayList.listIterator();

		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);

		}

//		while (iterator.hasNext()) {
//			Integer i = iterator.next();
//			System.out.println(i);
//
//		}
//		System.out.println("===========");
//		while (iterator.hasPrevious()) {
//			Integer i = iterator.previous();
//			System.out.println(i);
//		}
	}
}
