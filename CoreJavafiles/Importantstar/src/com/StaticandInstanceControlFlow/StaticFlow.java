package com.StaticandInstanceControlFlow;
/*Read indirectly write only state (or) RIWO :
With in the static block if we are trying to read any variable then that read is
considered as "direct read"
If we are calling a method , and with in the method if we are trying to read a method ,
that read is called Indirect read
If a variable is in RIWO state then we can't perform read operation directly otherwise
we will get compile time error saying " illegal forward reference ".*/

public class StaticFlow {
	public static int x = 10;
	public int a = 10;

	static {
		method();
		System.out.println("first static block");
	}
	static {

		System.out.println("second static block");
	}

	static void method() {
		System.out.println(j);
	}

	static int j = 20;

	public static void main(String[] args) {
		StaticFlow flow = new StaticFlow();
		System.out.println(flow.a);
		method();
		System.out.println("main method");

	}

}
