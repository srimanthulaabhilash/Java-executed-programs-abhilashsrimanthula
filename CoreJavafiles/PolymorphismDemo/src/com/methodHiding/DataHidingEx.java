package com.methodHiding;

public class DataHidingEx {
//	Our internal data should not go out directly that is outside person can't access
//	our internal data directly.
//   By using private modifier we can implement data hiding
//	The main advantage of data hiding is security.
//	Note: recommended modifier for data members is private.
	public int userId = 001;
	private String password = "Abhilash";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

	}

}
