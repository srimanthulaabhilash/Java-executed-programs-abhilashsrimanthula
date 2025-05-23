package com.collectionIMP;

import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("abhilash");// in order to add element
		linkedList.add(19);
		linkedList.add(10);
		linkedList.add(2, "hyd");// in order to add elememt in a particular index at 2
		linkedList.add(3, "abhi");// in order to add elememt in a particular index at 3
		linkedList.remove(2);// in order to remove elememt in a particular index at 2
		linkedList.add(0.5f);

//		System.out.println(linkedList.get(0));  index 0 is String
//		linked list internally stores the data in the object and
		Object data= linkedList.get(0);
		//conversion of one datatype(object) to another datatype(String) is called type casting
		String str =(String) data;
		System.out.println(str.toUpperCase());//we have number of methods in strings, not for Objects 
		
		Object obj= linkedList.get(1);
		Integer i=(Integer) obj;
		System.out.println(i);
		
		
		
	}

}
