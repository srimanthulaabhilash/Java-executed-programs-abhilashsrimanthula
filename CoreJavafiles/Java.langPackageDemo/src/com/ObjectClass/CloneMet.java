package com.ObjectClass;

public class CloneMet implements Cloneable {
	int num1 = 10;
	int num2 = 12;

	public static void main(String[] args) {
		CloneMet c1 = new CloneMet();
		try {
			CloneMet c2 = (CloneMet) c1.clone();
			c2.num1 = 88;
			c2.num2 = 99;
			System.out.println(c1.num1 + " =====" + c1.num2);
			System.out.println(c2.num1 + "=======" + c2.num2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
