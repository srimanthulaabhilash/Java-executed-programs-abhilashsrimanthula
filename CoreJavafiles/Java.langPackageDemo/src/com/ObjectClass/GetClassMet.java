package com.ObjectClass;

public class GetClassMet implements Cloneable {

	public static void main(String[] args) {
//		This method returns runtime class definition of an object.
		Object obj = new String("Abhi");
		System.out.println("run type object of obj is : " + obj.getClass().getName());

		System.out.println("==================");
		FinalizeEx ex = new FinalizeEx();
		FinalizeEx ex1 = new FinalizeEx();
		ex = null;
		ex1 = null;
		System.gc();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main method end");

	}

}

class FinalizeEx {
	FinalizeEx() {
		System.out.println("object is created ");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called before object is destroyed");

	}

}
