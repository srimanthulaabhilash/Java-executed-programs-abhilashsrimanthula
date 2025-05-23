package com.example;

public class Child extends Parent {
	void methodP() {
		System.out.println("Child");
	}

	public  static void main(String[] args) {
		Parent p = new Child();
		p.methodP();

	}

}
