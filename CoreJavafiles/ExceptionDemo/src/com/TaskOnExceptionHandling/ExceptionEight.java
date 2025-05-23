//8.You want to read an integer from the user using Scanner, but the user may input something
//that is not an integer. Handle this case and display an appropriate message.

package com.TaskOnExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEight {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter an number : ");
		try {
		int inputUser =scanner.nextInt();
		}
		catch (Exception e) {
			System.out.println("your are given invalid input Please give a Number ");
		}
		
		
				
	}

}
