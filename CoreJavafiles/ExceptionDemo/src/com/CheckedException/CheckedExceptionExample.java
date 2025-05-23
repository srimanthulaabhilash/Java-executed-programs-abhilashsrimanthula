package com.CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Checked Exception Or CompileTime Exceptions which will occur at the compile time
public class CheckedExceptionExample {
	public static void main(String[] args) throws FileNotFoundException {// using throws
//		FileReader file=new FileReader("exp.txt"); 

		try {
			FileReader file1 = new FileReader("example.txt"); // using try and catch
		}
		catch (FileNotFoundException e) {
			System.out.println("exception caught : " + e);
		}

	}

}
