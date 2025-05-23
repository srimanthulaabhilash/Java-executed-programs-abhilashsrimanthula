package com.collections.classmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortmet {

	public static void main(String[] args) {
//		To Sort Based on Default Natural Sorting Order.
//		 In this Case Compulsory List should contain Only Homogeneous andComparable
//		Objects. Otherwise we will get Runtime Exception Saying ClassCastException.
//		 List should Not contain null Otherwise we will get NullPointerException.
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(9);
		integers.add(4);
		integers.add(8);
		integers.add(2);
		System.out.println("Before sort ;" + integers);
		Collections.sort(integers);
		System.out.println("After sort :" + integers);

	}

}
