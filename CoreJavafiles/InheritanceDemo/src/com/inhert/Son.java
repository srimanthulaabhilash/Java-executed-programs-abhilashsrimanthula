package com.inhert;
/* ****by making class and main method as final we can prevent  extending to the child class*/

public class Son extends father {

	public int twoweller;
	public int threeWeller;

	public Son(int acrsLand, String car, int twoweller, int threeWeller) {
		super(acrsLand, car);
		this.twoweller = twoweller;
		this.threeWeller = threeWeller;
	}
	void details() {
		System.out.println("acrsLand="+acrsLand+"\ncar="+car+"\ntwoweller="+twoweller+"\nthreeWeller="+threeWeller);
	}
	
	static void methodOne() {//this is not overriding this is methodhiding
		System.out.println("byee");
	}

	public static void main(String[] args) {
		Son sobj = new Son(3, "car", 2, 3);
		father f=new Son(0, null, 0, 0);
		sobj.details();
		sobj.proporties(2, "car", 9);
//		sobj.twoWeller=3;
	}

}
