package com.CheckedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionExample1 {
	public static void main(String[] args)  {
		try {
		Connection connection=DriverManager.getConnection("jdbc mysql","user","abhu@123");
		}catch (SQLException e) {
			System.out.println("data base connection faild"+e);
		}
	}

}
