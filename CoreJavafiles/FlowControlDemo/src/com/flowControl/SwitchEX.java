package com.flowControl;

public class SwitchEX {
//	If several options are available then it is not recommended to use if-else we should go
//	for switch statement.Because it improves readability of the code.

//	Until 1.4 version the allow types for the switch argument are byte, short, char, int but
//	from 1.5 version on wards the corresponding wrapper classes (Byte, Short, Character,
//	Integer) and "enum" types also allowed

	public static void main(String[] args) {

//		Example 1:
		int x = 10;
		int y = 20;
		switch (x) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");

		}
//		Example 2:
		int r = 10;
		final int g = 20;
		switch (x) {
		case 10:
			System.out.println("30");
		case g:
			System.out.println("40");

		}
//		Example 3:
//			int f = 10;
//			switch (x) {
//			case 10:
//			case 10+20;
//			case 10+20+30;
//			
//			}
//		Example 4:
		byte m = 10;// byte ranges from -128 to 127
		switch (m) {
		case 10:
			System.out.println("abhi");
		case 100:
			System.out.println("hii");
//		case 1000:
//			System.out.println("hii");

		}
//		Example 5:
		byte q = 10;// byte ranges from -128 to 127
		switch (q+1) {
		case 10:
			System.out.println("10");
		case 100:
			System.out.println("100");
		case 1000:
			System.out.println("1000");
		}
//		Example 6:
		System.out.println("Example 6:");
			int  k = 10;// byte ranges from -128 to 127
			switch (k) {
			case 78:
				System.out.println("78");
			case 99:
				System.out.println("99");
			
			}
			
		

	}
}
