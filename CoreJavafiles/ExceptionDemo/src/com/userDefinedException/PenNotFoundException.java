package com.userDefinedException;

public class PenNotFoundException extends RuntimeException {

	PenNotFoundException(String str) {
		super(str);

	}

	public static void ValidateMoney(int money) throws PenNotFoundException {
		if (money < 5) {
			throw new PenNotFoundException("money must greater than 5 rps");
//			System.out.println("");

		} else {
			System.out.println("you can buy pen");
		}
	}

	public static void main(String[] args) {
		try {
			PenNotFoundException.ValidateMoney(8);
		} catch (PenNotFoundException p) {
			System.out.println("Exception Cagught : " + p.getStackTrace());

		}
	}

}
