package com.collectionIMP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItreationExp {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new <Integer>ArrayList(10);
		arrayList.add(88);
		arrayList.add(89);
		arrayList.add(90);
//		System.out.println(arrayList.get(1));
		System.out.println("for==========");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}
		System.out.println("for each===============");
		for (Integer x : arrayList) {
			System.out.println(x);

		}
		System.out.println("iteartor============");

		ListIterator<Integer> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println(i);

		}

		System.out.println("==========Arraylist1==========");
		ArrayList arrayList1 = new ArrayList();//by using genrics we can spicify the only one type of data 
		arrayList1.add("Srimanthula");     //by giving diffrent type of data we may get exception
		arrayList1.add("abhi");
		arrayList1.add(false);
		arrayList1.add("67");
		arrayList1.add(23);
		
		ListIterator iterator1 = arrayList1.listIterator();
		
		while (iterator1.hasNext()) {
		Integer obj = iterator.next();
		System.out.println();
		}
		
	

	}

}
