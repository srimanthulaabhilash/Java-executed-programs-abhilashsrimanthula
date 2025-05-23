package com.Array.Linked.ListEx.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample1 {
//generally the ArrayList Object is non Sysnchronized but we can get Sysnchronized version
//	by using the method from the collections class
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("abhi");
		arrayList.add("Hit man");
		List<String> list = Collections.synchronizedList(arrayList);// conversion of list from non sechronizes to 
																	// sechronizes
		// sechronizes version // non sychronizwd version
		arrayList.add("Element1");
		arrayList.add("Element2");
		arrayList.add("Element3");

		LinkedList<String> linkedList = new LinkedList<String>(arrayList);
		System.out.println(" before add elements :" + linkedList);
		linkedList.add("element4");
		linkedList.add("element5");
		System.out.println("after adding elements :" + linkedList);

		LinkedList<String> linkedList2 = new LinkedList<String>(arrayList);

		System.out.println("  linked List : " + linkedList2);

	}

}
