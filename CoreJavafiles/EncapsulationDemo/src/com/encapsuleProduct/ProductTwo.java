package com.encapsuleProduct;

public class ProductTwo extends ProductOne {

	public static void main(String[] args) {
		ProductTwo productTwo = new ProductTwo();// self Object
		System.out.println(productTwo.product);// we can access the public instance variable from same
		// package
//		System.out.println(productTwo.productId);//==>>productId is a Private variable and which
//		extends the parent class even though it cnannot accessed

		productTwo.productDate = 9;// ==>>But we can access the protected variable only in the inheritied class
		productTwo.getProductAddress();
		productTwo.getProductName();
		productTwo.setProductName(null);
		productTwo.setProductAddress(null);

	}

}
