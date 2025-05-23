package com.TaskOnInterface;

public interface Chargable {
	 void charge();

}
class Phone implements Chargable{

	@Override
	public void charge() {
		System.out.println("your phone is charged");
	}
	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.charge();
	}
	
}
