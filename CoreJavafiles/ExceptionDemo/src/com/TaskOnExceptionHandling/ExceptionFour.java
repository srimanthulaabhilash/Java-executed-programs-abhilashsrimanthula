//4.You attempt to create an array with a negative size. Try this and see what happens.

package com.TaskOnExceptionHandling;

public class ExceptionFour {
	public static void main(String[] args) {
		try {
			int[] Arr = new int[-3];
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}

}
