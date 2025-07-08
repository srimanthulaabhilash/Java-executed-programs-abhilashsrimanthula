package com.StaticandInstanceControlFlow;

public class Localvarible {

	public static void main(String[] args) {
		int i = 0;
		for (int j = 0; j < 3; j++) {
			i = i + j;
		}
//		System.out.println(i + " == " + j);// "j" is local varible which cannot acess outside of method ,
//		block or constructor

	}

}
