package com.waraperclasses;

public class ValueOfEx {

	public static void main(String[] args) {

		Integer i = Integer.valueOf(10);
		System.out.println(i);
		System.out.println(i.getClass());

		Double d = Double.valueOf(0.43d);
		System.out.println(d);
		System.out.println(d.getClass());

		Boolean b = Boolean.valueOf(true);
		System.out.println(b);
		System.out.println(b.getClass());

	}

}