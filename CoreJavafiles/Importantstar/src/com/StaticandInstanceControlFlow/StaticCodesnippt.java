package com.StaticandInstanceControlFlow;

public class StaticCodesnippt {
	int x = 10;
	//. Instance Variable (x)
//	Belongs to each object.
//	Each object has its own copy of x.
	
	static int y = 20;
	//Static Variable (y)
//	Belongs to the class, not to instances.
//	There is only one copy of y shared by all instances.

	public static void main(String[] args) {
		StaticCodesnippt codesnippt = new StaticCodesnippt();
		codesnippt.x = 100;
		codesnippt.y = 200;
		StaticCodesnippt codesnippt2 = new StaticCodesnippt();
		System.out.println(codesnippt2.x + " ============ " + codesnippt2.y);

	}

}
