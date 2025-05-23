package com.Queue.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
//	This is a Data Structure which can be used to Represent a Group of Individual Objects
//	Prior to processing according to Some Priority.
//	 The Priority Order can be Either Default Natural Sorting Order OR Customized Sorting
//	Order specified by Comparator Object.
//	 If we are Depending on Natural Sorting Order then the Objects should be Homogeneous
//	and Comparable otherwise we will get ClassCastException.
//	 If we are defining Our Own Sorting by Comparator then the Objects Need Not
//	beHomogeneous and Comparable.
//	 Duplicate objects are Not Allowed.
//	 Insertion Order is Not Preserved and it is Based on Some Priority.
//	 null Insertion is Not Possible Even as 1st Element Also.

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		// Adding elements (automatically sorted in ascending order)
		pq.add(50);
		pq.add(10);
		pq.add(30);
		pq.add(20);
		System.out.println("before Queue :" + pq);
		System.out.println(pq.poll());
		System.out.println("after poling :" + pq);
		System.out.println("============");
		Queue<Integer> customSorting = new PriorityQueue<Integer>(Comparator.reverseOrder());
		customSorting.add(29);
		customSorting.add(11);
		customSorting.add(64);
		customSorting.add(12);
		customSorting.add(89);
		System.out.println(customSorting);
		System.out.println(customSorting.poll());// (highest priority)
		System.out.println(customSorting.peek());// (lowest priority)
		System.out.println(customSorting);

	}

}
