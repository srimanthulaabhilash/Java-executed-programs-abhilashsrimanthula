package com.methodOverriding;

public class ChildExample extends MethodOverridingExample {
	@Override
	public void proporties(int land) {// ==>> overriding method
		System.out.println("override");
	}

	public void childProporties(String bankBalance) {
		System.out.println(bankBalance);
	}

	public static void main(String[] args) {
		ChildExample child = new ChildExample();
		child.proporties(0);
		System.out.println(child.id);
		
		
		MethodOverridingExample example=new ChildExample();
		example.proporties(4);//==>> ****generaly child class method cannot be inhereated through this object
		// by overriding parent class method in child class  we can call child class method 
		example.proporties1(5);
		System.out.println(example.id);
		

	}

}
