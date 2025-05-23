package com.map.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		map.put(1, "mon");
		map.put(2, "tus");
		map.put(3, "wed");
		map.put(4, "thu");
		map.put(5, "fri");
		map.put(6, "sat");
		map.put(7, "sun");
		System.out.println(map);
		map1.putAll(map);
		System.out.println(map1);
		

		

	}

}
