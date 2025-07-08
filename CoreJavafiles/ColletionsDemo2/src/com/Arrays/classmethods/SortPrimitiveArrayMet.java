package com.Arrays.classmethods;

import java.util.Arrays;

public class SortPrimitiveArrayMet {

	public static void main(String[] args) {
//		In order to sort the primitive int vlaues
		int numbers[] = { 2, 4, 6, 9, 23, 56, 52 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

//		To Sort According to Natural Sorting Order.
		String[] names = { "Charlie", "Alice", "Bob", "David" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
//		public static void sort(Object[] o, Comparator c);
//		To Sort According to Customized Sorting
//		Order.

	}

}
