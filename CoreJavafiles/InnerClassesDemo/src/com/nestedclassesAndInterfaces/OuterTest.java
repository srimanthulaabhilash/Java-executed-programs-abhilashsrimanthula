package com.nestedclassesAndInterfaces;

public class OuterTest implements OuterInterface.InnerInterface, OuterInterface {

	@Override
	public void methodInner() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodOuter() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		OuterTest outerTest = new OuterTest();
		outerTest.methodInner();
		outerTest.methodOuter();

	}

}
