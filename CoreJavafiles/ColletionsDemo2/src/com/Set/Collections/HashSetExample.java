package com.Set.Collections;

import java.util.HashSet;

//class of version 1.2v
public class HashSetExample {
//	when your requritement is do not allow duplicates (unique values) and not maintains insetion order 

//	  =>if we want to represent multiple
//	  =>objects as a single entity where only allows unique values and insertion
//	  order not maintains and allows only one null value
//	  =>The underlayong data structure is Hashmap
//	  => the load factor is 0.75 (where an hashset is filled by 75% automatically of its default capaicity is 16 )this factor is called load factor

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); //initial capacity is 16
		hashSet.add("abhi");
		hashSet.add("Mani");
		hashSet.add("Srimanthula");
		hashSet.add(null);
		System.out.println(hashSet.add("xy"));
		System.out.println(hashSet);
	}

}
