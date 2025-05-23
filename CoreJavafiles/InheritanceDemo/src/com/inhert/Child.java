package com.inhert;

public class Child extends Parent {
//	void MethodChild() {
//		System.out.println("Child method");
//		
//	}
	void MethodParent() {
		System.out.println("parent in child method");

	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.MethodParent();
		Child child = new Child();
		child.MethodParent();
		Parent p = new Child();
		p.MethodParent();

	}

}
