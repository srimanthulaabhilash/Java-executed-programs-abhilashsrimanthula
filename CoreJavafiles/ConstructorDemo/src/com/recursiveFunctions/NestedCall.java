package com.recursiveFunctions;
/*Calling a function inside another function is called nested call.
 * 
 In nested call there is a calling function which calls another function(called
function).*/

public class NestedCall {
	public static void methodOne() {
		methodTwo();

	}

	public static void methodTwo() {
		methodOne();

	}

	public static void main(String[] args) {
		NestedCall call=new NestedCall();
		call.methodOne();
		

	}

}
