package com.Task;

public class GetterSetterEx {
	private int Id;
	private String Password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public static void main(String[] args) {
		GetterSetterEx ex = new GetterSetterEx();
		ex.setId(1);
		ex.setPassword("$$$$$");
		/*
		 * we can set and get the value of a private variable using getters and setter
		 * mwthods and we can modify the value using set method according to our
		 * requriment
		 */

		System.out.println("Your Id :" + ex.getId());
		System.out.println("Your Password : " + ex.getPassword());

	}

}
