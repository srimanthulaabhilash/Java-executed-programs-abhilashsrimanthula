package com.methodOverloading;

public class methodOverloadingAPcase03 {
	void method3(String str1) {
		System.out.println(" String arg");

	}

	void method3(StringBuffer str2) {
		System.out.println(" Stringbuffer arg");

	}

	void method3(StringBuilder str3) {
		System.out.println(" Stringbuilder arg");

	}

	public static void main(String[] args) {
		methodOverloadingAPcase03 case3 = new methodOverloadingAPcase03();
//		case3.method3(null);
		case3.method3(new StringBuffer());
		case3.method3("ram");
		case3.method3("null");

	}

}
