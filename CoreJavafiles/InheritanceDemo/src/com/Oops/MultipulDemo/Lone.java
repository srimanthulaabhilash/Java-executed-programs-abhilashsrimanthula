package com.Oops.MultipulDemo;

public class Lone extends HomeLone  {
	//java not support Multipil Inhertince and it can be executed in Interface
	
	String fName;
	String lName;

	boolean documents(boolean aadhar, boolean tc, boolean pan) {
		System.out.println("Aadhar is :" + aadhar + " Tc is : " + tc + "Pan is :" + pan);
		return true;

	}

}
