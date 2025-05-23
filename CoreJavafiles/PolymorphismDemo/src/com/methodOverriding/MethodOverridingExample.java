package com.methodOverriding;

public class MethodOverridingExample {
	static int id=5;
//	what ever the parent has by default avilable to the child through the inheritance
//if child is not satisified with parent class implementation then the child is allow to redefine the
//parent class method in child class in its own  way is called	methooverriding
	public void proporties(int land) {//overridden method
		System.out.println(land);
	}

	public void proporties1(int twoWeller) {
		System.out.println("twowiller");
	}
	public static void main(String[] args) {
		MethodOverridingExample example=new MethodOverridingExample();
		example.proporties(3);
		example.proporties1(4);
	}

}
