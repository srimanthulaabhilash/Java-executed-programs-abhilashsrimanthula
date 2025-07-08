//6.You have an object that may be null, and you want to prevent a NullPointerException from 
//crashing your program.
package com.TaskOnExceptionHandling;


public class ExceptionSix {
	void methods() {
		System.out.println("Good mornig");
	}
	public static void main(String[] args) {
		ExceptionSix exceptionSix =new ExceptionSix();
		try {
			exceptionSix=null;
		}catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		exceptionSix.methods();
		
		
	}

}
