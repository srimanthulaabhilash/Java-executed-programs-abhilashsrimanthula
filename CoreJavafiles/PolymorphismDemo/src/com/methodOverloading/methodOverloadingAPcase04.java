package com.methodOverloading;

public class methodOverloadingAPcase04 {
	void method4(int x,float y) {
		System.out.println(" int - float  args");
		
	}
	void method4(float x,int  y) {
		System.out.println(" float - int  args");
		
	}
	void method4(int x,double z) {
		System.out.println(" int - double  args");
		
	}

	public static void main(String[] args) {
		methodOverloadingAPcase04 case4 =new methodOverloadingAPcase04();
		case4.method4(0.5f, 8);
		case4.method4(4, 0.5f);
//		case4.method4(0.9f, 0.8f);
//		case4.method4(10, 10);
		case4.method4(3, 5678l);
		
		

	}

}
