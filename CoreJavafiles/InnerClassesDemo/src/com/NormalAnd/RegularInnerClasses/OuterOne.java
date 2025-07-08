package com.NormalAnd.RegularInnerClasses;
//Acession inner class code from the instance area of outer class

public class OuterOne {
	class InnerOne {
		public void methodInner() {
			System.out.println("method in inner class abhilash");
		}
		public static void main(String[] args) {
			
		}

	}

	public void methodOuter() {
		System.out.println("method in outer  classes  Srimanthula");
		InnerOne innerone = new InnerOne();
		innerone.methodInner();
	

	}

	public static void main(String[] args) {
		OuterOne outerone = new OuterOne();
		outerone.methodOuter();

	}

}
