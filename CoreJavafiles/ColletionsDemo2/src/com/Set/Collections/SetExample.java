package com.Set.Collections;

import java.util.HashSet;
//                                    Set(I)
//					1)HAshSet(c)                        2)SortedSet(I)
//				   ==LinkedHashSet (c)                    ==NavigableSet(I)
//																==TreeSet(c)
//It is Child interface od collection
//It does not allow duplicates 
//it does not maintain any inserition order 
public class SetExample {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("one");
		set.add("Two");
		set.add("Three");
		set.add("one");
		System.out.println(set);
		
		
	}

}
