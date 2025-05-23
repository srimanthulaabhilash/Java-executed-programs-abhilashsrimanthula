package com.methodOverriding;

public abstract class ChildExample2 extends MethodOverridingExample2 {

	@Override // ==>> parent class non final methods we can override as final in child class
	// we can override native methods in child classes
	public final void parentMethod() {
		System.out.println("parent method with final modifier");
	}

	@Override
	void methodP() {// ==>>implementation method in the child class
		System.out.println("we can Override an abstract method in the child class and make implimantation ");
	}
	@Override
	public abstract void methodP1();//==>>non abstract method in parent class and and abstract method in child class 
	
//	@Override//==>>we cannot override ststic methods
//	public static void methodP2() {
//		System.out.println("method with implementation in parent class");
//
//	}

	public static void main(String[] args) {
//		ChildExample2 childExample2 = new ChildExample2();
//		childExample2.parentMethod();
	}

}
