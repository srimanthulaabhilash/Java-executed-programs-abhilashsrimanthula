package com.Set.Collections;

import java.util.TreeSet;
//when your requriment is to dont allow duplicates and insertion order not maintains and maintains some natural sorting order
//then go with the sortedset(I)and tressSet(Implemented class)

//class of version 1.2v

public class TreeSetExample {
//	=> the underlaying data structure is balanced tree
//	=>insertion order is not preversed and is based on the some sorting order .
//	=> hetrogenous objects are not allowed
//	=> duplicates objects are not allowed
//	=>null insertion is not possioble.

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		
		treeSet.add("sunday");
		treeSet.add("monday");
		treeSet.add("tuesday");
		treeSet.add("wed");
		treeSet.add("thrusday");
		treeSet.add("friday");
		treeSet.add("sat");
//		treeSet.add(3);// ==not allow the hetrogenous data
//		treeSet.add(null);//== not allow
		System.out.println(treeSet);/*
									 * The TreeSet in Java stores elements in sorted (natural) order, not insertion
									 * order. For strings, "natural order" means lexicographical (dictionary) order
									 * based on Unicode values.
									 */

	}

}
