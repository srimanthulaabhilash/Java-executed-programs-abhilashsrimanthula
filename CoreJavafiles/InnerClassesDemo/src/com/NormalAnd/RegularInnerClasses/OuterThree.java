package com.NormalAnd.RegularInnerClasses;
//from inner class method we can acesses all members of outer classes (static and non static )(Private and non provate)

//with in the inner class"this"always refers to the current inner class object,to refer current outer class object we have to use
//"outer class name.this"

public class OuterThree {
	int id = 9;
	int x=10;
	private static String s = "abhi";//==>private varible

	private void method1() {
		System.out.println("Outer inner method");
	}

	void method2() {
		System.out.println("Outer inner static method");
	}

	class InnerThree {
		int x=100;
		void methodInner() {
			int x=1000;
			System.out.println(id);
			System.out.println(s);
			System.out.println(x);//1000
			System.out.println(this.x);//100
			System.out.println(OuterThree.this.x);
			
			

		}
	}

	public static void main(String[] args) {
		OuterThree outerThree = new OuterThree();
		OuterThree.InnerThree innerThree = outerThree.new InnerThree();
		outerThree.method1();
		outerThree.method2();
		innerThree.methodInner();
	}
}
