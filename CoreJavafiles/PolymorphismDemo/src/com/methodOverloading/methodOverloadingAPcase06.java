package com.methodOverloading;

public class methodOverloadingAPcase06 {
}

class Animal {

}

class Tiger extends Animal {

}

class Test {
	void method6(Animal a) {
		System.out.println("Animal type");
		
	}
	void method6(Tiger t) {
		System.out.println("tiger type");

	}

	public static void main(String[] args) {
		Test test=new Test();
		Animal animal=new Animal();
		test.method6(animal);
		
		Tiger tiger=new Tiger();
		test.method6(tiger);
		
		Animal x=new Tiger();
		test.method6(x);
		
		

	}
}
