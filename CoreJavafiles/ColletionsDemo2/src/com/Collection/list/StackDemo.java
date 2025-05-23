package com.Collection.list;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>st = new Stack<>();
		st.push("abhi");
		st.push("akhi");
		st.push("abhilash"); 
		
		System.out.println(st);
		String pop = st.pop();
				System.out.println(pop);
				
		String pop1 = st.peek();
		System.out.println(pop1 );
		 

	}

}
