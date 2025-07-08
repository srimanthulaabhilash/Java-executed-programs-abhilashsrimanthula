package com.flowControl;

public class FlowControlIfEx {

	public static void main(String[] args) {
//		case 1
		int x = 10;// it is int type it must be boolean type
//		if(x) {
//			System.out.println("hello");
//		}
		
//		Case 2
		if (x == 20) {
			System.out.println("boolean data type");
		} else {
			System.out.println("null");
		}

//		Case 3
		boolean b = false;
		if (b = true) {
			System.out.println("it is false");
		} else {
			System.out.println("it is true");

		}

//		Case 4
		boolean c = false;
		if (c == true) {
			System.out.println("hii");
		} else {
			System.out.println("byee");

		}
		
//		Case 5
		if (true) 
			System.out.println("case 5 :"+"hello");
		
//		Case 6
//		if (false) 
//			System.out.println(":"+"hello");
		
//		Case 7
//		if (true) //complile time error
//			int s=10;
		
//		Case 8
		if (true) 
			System.out.println("hello");
		   System.out.println("hii");
			
		

		
		
		

		
		
		
		
		

	}

}
