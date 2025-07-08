package com.map.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
//	The Underlying Data Structure is Hashtable.
//	 Duplicate Keys are Not Allowed. But Values can be Duplicated.
//	 Heterogeneous Objects are allowed for Both Keys and Values.
//	 Insertion Order is not preserved and it is based on hash code of the keys.
//	 null Insertion is allowed for Key (Only Once) and allowed for Values (Any Number of

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "ab");
		map.put(3, "cd");
		map.put(1, "ef");
		map.put(4, "gh");

		System.out.println(map);

		Collections.synchronizedMap(map);//synchronized version of HashMap.
		

	}

}
