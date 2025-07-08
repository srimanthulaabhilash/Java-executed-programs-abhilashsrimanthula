package com.functionalintrface;

import java.util.Iterator;

public class StringSort {
	static String sorttring(String str) {
		char[] chr = str.toCharArray();
		int n = chr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (chr[j] > chr[j + 1]) {
					char temp = chr[j];
					chr[j] = chr[j + 1];
					chr[j + 1] = temp;
				}
			}
		}
		return new String(chr);
	}

	public static void main(String[] args) {
		System.out.println(sorttring("Abhilash"));

	}

}
