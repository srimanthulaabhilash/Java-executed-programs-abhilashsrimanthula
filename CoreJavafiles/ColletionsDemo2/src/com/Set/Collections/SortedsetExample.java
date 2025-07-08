package com.Set.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

//when your requriment is to dont allow duplicates and insertion order not maintains and maintains some natural sorting order
//then go with the sortedset(I)and tressSet(Implemented class)
//interface (1.2)
public class SortedsetExample {
//	=>It is the Child Interface of Set.
//	=>If we want to Represent a Group of Individual Objects without Duplicates and all
//	 Objects will be Inserted According to Some Sorting Order, then we should go for
//	 SortedSet.
//	 The Sorting can be Either Default Natural Sorting OR Customized Sorting Order.
//	=> For String Objects Default Natural Sorting is Alphabetical Order.
//	=>For Numbers Default Natural Sorting is Ascending Order

//	Initial Capacity (16):
//	Load Factor (0.75)	
//	Formula: capacity * loadFactor
//	For default: 16 * 0.75 = 12
//	When the number of elements exceeds 12, the capacity doubles to 32.

	public static void main(String[] args) {
		SortedSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10); // Duplicate, won't be added
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println("headset : " + numbers.headSet(40));
		System.out.println("tailset : " + numbers.tailSet(30));
		System.out.println("subset is :" + numbers.subSet(10, 40));
		System.out.println(numbers.size());
		System.out.println(numbers.contains(30));

	}

}
