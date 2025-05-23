package com.constructor;

public class ChainChild extends ConstructorChaining {
	ChainChild() {
		super();
		System.out.println("child class constructor");
		System.out.println(this.hashCode());
		System.out.println(super.hashCode());


	}

	public static void main(String[] args) {
		ChainChild chainChild = new ChainChild();

	}

}
