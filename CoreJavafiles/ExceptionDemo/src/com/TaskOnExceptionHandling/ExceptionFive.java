//5.You want to access an element of an array. However, there’s a possibility that you might
//try to access an invalid index. You need to handle this gracefully and print custom message.
package com.TaskOnExceptionHandling;

public class ExceptionFive {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5 };
		try {
			System.out.println(arr[4]);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(arr[0]);

	}
}