package com.methodOverloading;

public class methodOverloadingAPcase05 {
	 void method4(int x) {
		 System.out.println("x - general");
		 
	 }
	 void method4(int...y) {
		 System.out.println(" x ... method");
		 
	 }
	 

	public static void main(String[] args) {
		methodOverloadingAPcase05 case5=new methodOverloadingAPcase05(); 
		case5.method4(8);
		case5.method4(4,5,6,7,7,4);
		case5.method4();
	}

}
