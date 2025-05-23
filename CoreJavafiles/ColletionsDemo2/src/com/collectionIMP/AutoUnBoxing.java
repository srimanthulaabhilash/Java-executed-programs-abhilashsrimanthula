package com.collectionIMP;

//Order of widening type casting:
//byte -> short -> char -> int -> long -> float -> double 
//Narrowing Type Casting or  up casting

public class AutoUnBoxing {
//	AutoBoxing : The automatic conversion of primitive data types
//	to its correspoinding objects is call autoboxing
//	

	public static void main(String[] args) {
		int x=6;
		Integer c=Integer.valueOf(x);//convertion int(primitive to Object)
		System.out.println(c.getClass().getTypeName());
		int x1=4;
		Integer i=x1;//==>> autoboxing the compiler will write Integer.valueOf() internally
		System.out.println(i.getClass());

		
		//Unboxing  ===converting integer to int
		Integer u=new Integer(8);
		int N=u.intValue();//convertion integer to int
		int j=u;//unboxing now compiler will wright i.intValue() internally.
		
//		System.out.println(j.getClass().getTypeName());
		
	}

}
