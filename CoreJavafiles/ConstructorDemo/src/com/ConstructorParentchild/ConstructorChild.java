package com.ConstructorParentchild;

public class ConstructorChild extends ConstructorParent {

	ConstructorChild(int i) {
//		super(i);
	}

	ConstructorChild(String str) {
		super();

	}

	public static void main(String[] args) {
		ConstructorChild child = new ConstructorChild(8);
		ConstructorChild child1 = new ConstructorChild("abhi");

	}

}
