package com.collectionIMP;

import java.util.ArrayList;
import java.util.Iterator;

public class iterationDemo {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		al.add("up");
		al.add("down");
		al.add("east");
		al.add("West");
		//for (int i = 0; i< al.size(); i++);{
		//System.out.println("Element is::"+al.get(i));
		//}
		System.out.println("for Each========");
		for(String temp : al) {
		System.out.println("element is::"+temp);
		}
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println("Element is::"+itr.hasNext());
	}
//		while(itr.hasPrevious()) {
//			System.out.println("element is ::"+itr.hasPrevious);
//			
//			
//		}
			
	}

}
