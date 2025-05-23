package com.TaskOnInterface2;

public abstract class Mammal implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub

	}

	abstract void sleep();

	class Dog {
		public void makeSound() {
			System.out.println("Dog make Sounds");
		}
		void sleep() {
			System.out.println("dog will sleep");
			
		}

	}
	public static void main(String[] args) {
//		Dog dog=new Dog(){
//			
//			
//			
//		};
		
	}

}
