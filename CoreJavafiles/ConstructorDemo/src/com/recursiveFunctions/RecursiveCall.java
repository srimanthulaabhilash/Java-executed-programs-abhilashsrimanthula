package com.recursiveFunctions;
/*Calling a function within same function is called recursive call.
 In recursive call called and calling function is same.*/

public class RecursiveCall {
	 RecursiveCall(){
//		 this(10);
		 
	 }
	 RecursiveCall(int i){
//		 this();recursive constructor invocation
		 
		 
	 }
	
	void methodOne() {
		methodOne();
	}

	public static void main(String[] args) {
		RecursiveCall call=new RecursiveCall();
		call.methodOne();
	}

}
