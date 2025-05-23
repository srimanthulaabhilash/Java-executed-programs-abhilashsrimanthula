package com.ConstructorParentchild;
/*If the Parent class contains any argument constructors while writing Child
classes we should takes special care with respect to constructors.
 Whenever we are writing any argument constructor it is highly recommended to
write no argument constructor also.*/

public class ConstructorParent {
	ConstructorParent() {
		System.out.println("no arg constructor");
	}

	ConstructorParent(int i) {
		System.out.println("parameterised constructor");

	}
	ConstructorParent(String str) throws Exception
	{
		System.out.println("parameterised constructor");

	}

	public static void main(String[] args) {
		ConstructorParent constructorParent=new ConstructorParent();

	}

}
