package com.Task;

public class GetterSetterCon {
	private int Id;
	private String Password;

	GetterSetterCon(int Id, String name) {
		this.Id = Id;
		this.Password = Password;
	}

	public int getId() {
		return Id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	void Display() {
		System.out.println("Id :" + Id);
		System.out.println("Password : " + "**********");
	}

	public static void main(String[] args) {
		/*
		 * when you are setting the value using constructor we cannot change the value,
		 * untill you create new object and we don't have any method to change value
		 * using constructor.
		 */
		GetterSetterCon con = new GetterSetterCon(01, "abhilash");
		con.Display();

	}

}
