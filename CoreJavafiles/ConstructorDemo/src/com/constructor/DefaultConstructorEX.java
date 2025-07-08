package com.constructor;
/*1. For every class in java including abstract classes also constructor concept is
applicable.
2. If we are not writing at least one constructor then compiler will generate default
constructor.
3. If we are writing at least one constructor then compiler won't generate any
default constructor. Hence every class contains either compiler generated
constructor (or) programmer written constructor but not both simultaneously*/

public class DefaultConstructorEX {
	String name;
	/*1. It is always no argument constructor.
	2. The access modifier of the default constructor is same as class modifier. (This
	rule is applicable only for public and default).
	3. Default constructor contains only one line. super(); it is a no argument call to
	super class constructor*/
	
	DefaultConstructorEX(){
		System.out.println("constructor");
		/*super(); this should be first Line
		 * We have to take super() (or) this() only in the 1st line of constructor. If we are
taking anywhere else we will get compile time error. */
		
		/*super();
		this();We can use either super() (or) this() but not both simultaneously.*/
	
	}

	public static void main(String[] args) {
		DefaultConstructorEX constructorEX=new DefaultConstructorEX();
		

	}

}
