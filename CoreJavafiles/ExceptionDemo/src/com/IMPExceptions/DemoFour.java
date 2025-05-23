package com.IMPExceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoFour {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Element1");
	        list.add("Element2");
	        list.add("Element3");

	        // Attempting to access an invalid index
	        System.out.println("List size: " + list.size());
	        System.out.println("Accessing element at index 3: ");
	        
	        // This will throw IndexOutOfBoundsException
	        try {
	        System.out.println(list.get(3));
	        }catch (Exception e) {
	        	System.out.println("Exception caught"+e);
			}

}
}
