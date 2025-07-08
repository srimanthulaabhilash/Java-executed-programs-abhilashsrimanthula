 package com.Collection.list;

import java.util.ArrayList;

public class ArrayListDemo {
	//collections ==>1)List   2)set  3)queue
	//List==> Array list    ,LinkedList
	//it maintains the insertion Order and accepts the duplication
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Abhilash");
		al.add(47);
		al.add("animal");
		al.add(al);
		System.out.println(al);
//inOrderTOPrintInteger===typeCasting
		Object firstElementInMyList = al.get(1);
		Integer ogValue = (Integer)firstElementInMyList;
		System.out.println(ogValue);
//inOrderToPrintString===
		Object secElementInMyList = al.get(0);
		String ogValue1 = (String)firstElementInMyList;
		System.out.println(ogValue1);
		
		//<String>===>generic it allow the only same type of data
		ArrayList<String> al2 = new ArrayList<>();
		
		al2.add("abhi");//onlyStrings Are Allowed
		al2.add("akhi");
		al2.add("23");//integer should be placed in String
		
		
		
		
	}

}
