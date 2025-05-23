package com.methodHiding;
//Only static methods can be hidden. Instance methods are overridden.

//method hiding works only with the static methods
//Static methods belong to the class, not to any specific object.

public class ParentEX {
	static void methodParent() {
		System.out.println("parent method which is static");

	}
	static void methodParent1() {
		System.out.println("parent method which is static");

	}
	

	public static void main(String[] args) {
		ParentEX ex=new ParentEX();
		
	}

}
