package com.encapsuleUser;

import com.encapsuleProduct.*;//==>.importing pckage from another package

public class UserOne {
	public  final int user = 0;//==>instance variable

	public static void main(String[] args) {

		UserOne userObj = new UserOne();
		System.out.println(userObj.user);

//		
		ProductOne productObj = new ProductOne();//==>>
		//Object from the other Package and we can access variables and methods through that object
//		System.out.println(productObj.product);
		productObj.methodDetails(1, null, null);
//		productObj.productId ==>> we cannot access private variable

	}

}
