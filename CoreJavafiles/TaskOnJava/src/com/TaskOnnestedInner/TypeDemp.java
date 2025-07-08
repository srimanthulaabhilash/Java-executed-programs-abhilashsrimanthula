package com.TaskOnnestedInner;

public class TypeDemp {
	void methodA() {
		System.out.println("A");
	}
	class Type{
		void methodB() {
			
		}
	}
	public static void main(String[] args) {
		TypeDemp demp=new TypeDemp();//outer obj
		demp.methodA();
		TypeDemp.Type type=demp.new Type();//inner obj
		type.methodB();
		
	}
	

}
