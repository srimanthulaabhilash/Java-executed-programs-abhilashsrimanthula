package com.methodOverloading;

public class methodOverloadingAPcase01 {//method overloading example
	// sequeance of flow
//	byte > short >int > long >floate > double >
//	       char  >
	
	public void methodOne(double i) {
		System.out.println("d arg");
		
	}
	public void methodOne(float f) {
		System.out.println("float arg");
		
	}
	public void methodOne(int f) {
		System.out.println("int  arg");
		                                 //==>overloaded methods
	}
	public void methodOne(long f) {
		System.out.println("long arg");
		
	}
	public static void main(String[] args) {
		methodOverloadingAPcase01 case1= new methodOverloadingAPcase01();
		case1.methodOne(0L);
		case1.methodOne('f');
		case1.methodOne(1000000000L);
		case1.methodOne('d');
		case1.methodOne(2);
		case1.methodOne(5.66);
		case1.methodOne(10.5);

	}

}
