package com.constructor;
/*1. Both instance block and constructor will be executed automatically for every
object creation but instance block 1st followed by constructor.
2. The main objective of constructor is to perform initialization of an object.
3. Other than initialization if we want to perform any activity for every object
creation we have to define that activity inside instance block.
4. Both concepts having different purposes hence replacing one concept with
another concept is not possible.
5. Constructor can take arguments but instance block can't take any arguments
hence we can't replace constructor concept with instance block.
6. Similarly we can't replace instance block purpose with constructor.

********
The only applicable modifiers for the constructors are public, default, private,
protected.*/

public class ConstructorVSInstance {
	 static int count = 0;

	{
		count++;//instance block
		System.out.println("Abhilash");

	}

	ConstructorVSInstance() {

	}

	ConstructorVSInstance(int i) {

	}
	void  ConstructorVSInstance(){
		System.out.println("");/* It is not a constructor it is a method*/
		 
	 }
	/*static ConstructorVSInstance(String str){
		   No static or any other modifiers for constructors
	}*/

	public static void main(String[] args) {
		ConstructorVSInstance x=new ConstructorVSInstance();
		ConstructorVSInstance x1 =new ConstructorVSInstance(4);
		ConstructorVSInstance x2=new ConstructorVSInstance();
		System.out.println("the count of objects "+count);
	/*	Return type concept is not applicable for constructor even void also by mistake if
		we are declaring the return type for the constructor we won't get any compile
		time error and runtime error compiler simply treats it as a method.*/
		

	}

}
