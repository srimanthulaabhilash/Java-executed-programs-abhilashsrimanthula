package com.methodHiding;

public class ChildEX extends ParentEX {
	static void methodParent() {
		System.out.println("child  method which is static");

	}
	static void methodChild() {
		System.out.println("child  method which is static method hiding");

	}

	public static void main(String[] args) {
		ParentEX ex=new ChildEX();
		ex.methodParent();
		ex.methodParent1();
		
	

	}

}
