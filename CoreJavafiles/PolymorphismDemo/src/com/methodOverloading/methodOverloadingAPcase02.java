package com.methodOverloading;

public class methodOverloadingAPcase02 {
	void method2(String str) {
		System.out.println("string arg");

	}

	void method2(Object obj) {
		System.out.println("Object arg");

	}

	public static void main(String[] args) {
//==>> object is the parent class of all clases and for String	also	
//==>> object is parent class and String child class where String extends objects
//==>> both object and string has defalit value is null
//==>> when you pass the value "null"by defualt it tkes the child class
//==>> when you give particularly the object then it will take as object	
		
//==>>*******while resolving overloading methods excact match will always get high priority
//==>>*******while resolving overloading methods child class will get more priority then parent

		methodOverloadingAPcase02 case2 = new methodOverloadingAPcase02();
		case2.method2(null);
		case2.method2("null");
		case2.method2("abhi");
		case2.method2(new Object());

	}

}
