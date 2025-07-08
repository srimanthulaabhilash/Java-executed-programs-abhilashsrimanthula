package com.methodOverriding;

public class ChildExample1 extends MethodOverridingExample1 {
//	According to child class method return type need not to be same as parent class method return type
	@Override // Object =Parent
				// String = Child
	public String methodP() {
		System.out.println("String  method");
		return null;
	}

//	@Override  ==> it is not allowed 
	public void ParentMethod() {// the private method which is in Parent class cannot be override
		// but it is not overriden and we can write same type method in child class
		System.out.println("child method");
	}

//	@Override
//	public void parentExample() {// ==>> we cannot override a final method in child
//		System.out.println("parentExample");
//
//	}

	public static void main(String[] args) {
		ChildExample1 childExample1 = new ChildExample1();
		childExample1.methodP();
		childExample1.ParentMethod();
		// childExample1.childExample();
	}

}
