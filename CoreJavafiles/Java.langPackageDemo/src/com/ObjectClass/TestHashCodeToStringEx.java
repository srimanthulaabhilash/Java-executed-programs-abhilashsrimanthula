package com.ObjectClass;

public class TestHashCodeToStringEx {

	public static void main(String[] args) {
		HashCodeEx codeEx = new HashCodeEx(10);
		HashCodeEx codeEx2 = new HashCodeEx(100);
		System.out.println(codeEx);
		System.out.println(codeEx2);

		System.out.println("=============");

		toStringEx ex = new toStringEx(13);
		toStringEx ex1 = new toStringEx(14);
		System.out.println(ex);
		System.out.println(ex1);

	}

}

class HashCodeEx {
	int i;

	HashCodeEx(int i) {
		this.i = i;
	}

}

class toStringEx {
	int i;

	public int hashCode() {
		return i;

	}

	toStringEx(int i) {
		this.i = i;
	}

}
