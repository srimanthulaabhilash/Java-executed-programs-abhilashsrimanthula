package com.collections.classmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchMet {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(18, 23, 52, 18, 47));
		Collections.sort(arrayList);
//		method 1:
		int index = Collections.binarySearch(arrayList, 23);
		System.out.println(index);
//method 2:
		int index1 = Collections.binarySearch(arrayList, 18);
		System.out.println(index1);
		System.out.println(arrayList);

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(18, 23, 52, 18, 47));

		Collections.reverse(arrayList1);
		System.out.println(arrayList1);

	}

}
