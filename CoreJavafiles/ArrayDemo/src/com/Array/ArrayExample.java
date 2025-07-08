package com.Array;

public class ArrayExample {
//	An array is an indexed collection of fixed number of homogeneous data elements.
//	The main advantage of arrays is we can represent multiple values with the same name
//	so that readability of the code will be improved.

	public static void main(String[] args) {
		int a[]=  {2,4,5};
		
		int[] N;
//		N= {2,34};//==>> must intilisation and decleare in one line  other wise compile error
		
		

//		int [8]b;// ==>>not valid

		int c[];

		int[] num = new int[4];
		System.out.println(num.length);//only for arrays , It represents the size of the array.
//		System.out.println(num.length());//only for Strings ,It returns the no of characters present in the String.
		System.out.println();

		
//		int [] nums=new int[];==>> we must provide the size for new key word
//		System.out.println(num);
//		System.out.println(num[0]);
		
		int[][] num1=new int[2][4];
		System.out.println(num1);
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[1][1]);
		
		int[][][] z={{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		System.out.println(z[0]);
		
		
//		int[] x =new int[-3];// run time NestedArraySizeException
		
//		The maximum allowed array size in java is maximum value of int size [2147483647].
		 char[] c1= {'a','b','h','i'};
		 int[] a1= {3,4,5};
		 String str[]= {"abhilash","Srimanthula"};
		 System.out.println(str[1]);
		 System.out.println(c1);
		 System.out.println(a1[0]);

	}

}
