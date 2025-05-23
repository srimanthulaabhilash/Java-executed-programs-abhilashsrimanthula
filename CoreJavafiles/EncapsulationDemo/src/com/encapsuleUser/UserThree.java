package com.encapsuleUser;
import com.encapsuleProduct.*;

public class UserThree  {
//	ProductOne productone=new ProductOne(); // this class is not static so u can not call from static method
	
	public static void main(String[] args) {
		
		ProductOne productone=new ProductOne();
		
		productone.setProductName(null);
		productone.setProductAddress(null);
		
	}
	
	

}
