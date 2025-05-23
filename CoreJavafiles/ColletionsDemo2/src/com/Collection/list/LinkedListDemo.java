package com.Collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("abhi");
		ll.add("akhi");
		ll.add("ramesh");
		ll.add("suresh");
		System.out.println(ll);
		
		for(int i = 0; i< ll.size();i++) {
			System.out.println(ll.get(i));	
		}
		System.out.println("=============");
		for(String temp: ll) {
			System.out.println(temp);	
		}
		Iterator<String> Itr = ll.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());
			
		}
		 
	}

}
