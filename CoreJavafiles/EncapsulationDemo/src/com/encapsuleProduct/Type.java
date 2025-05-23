package com.encapsuleProduct;

public class Type extends Type0 {

//	@Override
	private void methodT() {
		System.out.println(" Private==>>private ,override concept is not applicable");
	}
	@Override
	protected void methodT2() {
		System.out.println("default==>>default,protucted,public");

	}
	@Override
	public void methodT3() {
		System.out.println("protucted==>>protucted,public");

	}
	@Override
	 public void methodT4() {
		System.out.println("public ==>>public");
	}
	

	public static void main(String[] args) {

	}

}
