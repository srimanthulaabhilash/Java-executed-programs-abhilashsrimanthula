package com.methodOverriding;

public abstract class MethodOverridingExample2 {

	public void parentMethod() {// ==>> method with final modifier cannot be override in child class
		System.out.println("parent method with no final modifier");
	}

	abstract void methodP(); // abstract method

	public void methodP1() {
		System.out.println("method with implementation in parent class");

	}
	public static void methodP2() {//ststic method cannot be overriden
		System.out.println("method with static keyword in parent class");

	}
	

	public static void main(String[] args) {
//		MethodOverridingExample2 example2 = new MethodOverridingExample2();
//		example2.parentMethod();
	}
}
