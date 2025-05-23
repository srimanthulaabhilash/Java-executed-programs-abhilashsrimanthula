package com.methodOverriding;

public class MethodOverridingExample1 {
//==>> untill 1.4version the return type must be same for an overidden and overriding method
	// but from 1.5 on wards co variant return types are allowed

	public Object methodP() {
		System.out.println("Object  method");
		return null;
	}
	

	private void ParentMethod() {//==>>method in parent class which is private and 
//		cannot be override in child class
		System.out.println("parentmethod");

	}
	public final void parentExample() {//method with final we cannot override in the child class
		System.out.println("parentExample");
		
	}

	public static void main(String[] args) {
		MethodOverridingExample1 example1=new MethodOverridingExample1();
		example1.methodP();
		example1.ParentMethod();
		example1.parentExample();
	}

}
