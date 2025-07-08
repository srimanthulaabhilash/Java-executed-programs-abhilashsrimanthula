package com.TaskOnInterface;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape =new Shape() {
			
			@Override
			void area() {
				System.out.println("area of circle");
			}
		};
		Shape shape2=new Shape() {
			
			@Override
			void area() {
				System.out.println("area of rectangle");
			}
		};
		shape.area();
		shape2.area();
	}

}
