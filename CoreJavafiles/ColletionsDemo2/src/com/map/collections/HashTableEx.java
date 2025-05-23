package com.map.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
//	The Underlying Data Structure for Hashtable is Hashtable Only.
//	 Duplicate Keys are Not Allowed. But Values can be Duplicated.
//	 Insertion Order is Not Preserved and it is Based on Hashcode of the Keys.
//	 Heterogeneous Objects are Allowed for Both Keys and Values.
//	 null Insertion is Not Possible for Both Key and Values. Otherwise we will get Runtime
//	Exception Saying NullPointerException.
//	 Every Method Present in Hashtable is Synchronized and Hence Hashtable Object is Thread
//	Safe.

	public static void main(String[] args) {
		Map<Integer, String> table = new Hashtable<Integer, String>();
//		It is similar to HashMap but has some key differences, mainly in synchronization and legacy support.
		 // Adding elements
        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");
        System.out.println(table);
		
	}

}
