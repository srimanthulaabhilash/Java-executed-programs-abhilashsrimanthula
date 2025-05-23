package com.Oops.InterfaceDemo;

public class Lone implements EducationalLone, PersonalLone, HomeLone {
//	Java supports multiple Inhertance through the Interface 

	public static void main(String[] args) {
		Lone lone = new Lone();
//		lone.method0E();
//		lone.methodH();
//		lone.methodP();
//		int edoc2 = EducationalLone.Edoc;
//		 System.out.println(EducationalLone.Edoc);
	}

	@Override
	public void methodH(int aNum, int mobileNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodH(int aNum, String f_name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodH() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodP(int aNum, String f_name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodP(int aNum, int mobileNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodP() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodE(int aNum, String f_name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodE(int aNum, int mobileNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodE() {
		// TODO Auto-generated method stub

	}

}
