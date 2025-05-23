package InterfaceExample;

public interface InterfaceEx {
	static int num=9;
	public  int num1=9;
//	protected String Password;
	final String Name="abhi";
//	private int id=100;
//	protected String surname="Srimanthula";
	
	
	public void method();
	
	
	private void method2() {
		System.out.println("a method in interface which is private");
		
	}
	static void method3() {
		System.out.println("a static method in the interface  which as implementation");

	}
	default void method4() {
		System.out.println("a default method in the interface  which as implementation");

	}
	public static void main(String[] args) {
		
	}
		
	

	
	

}
