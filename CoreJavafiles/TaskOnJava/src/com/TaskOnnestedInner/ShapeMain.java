//4.Create an abstract class Shape with an abstract method area(). Then create two non-abstract 
//subclasses Circle and Rectangle, which calculate the area of their respective shapes.
package com.TaskOnnestedInner;

abstract class Shape {
	abstract void methodArea();

	class Circle {
		void areaOfCircle() {
			System.out.println("area of circle");
		}

	}

	class Rectangle {
		void areaOfRectangle() {
			System.out.println("area of rectangle");
		}

	}

}

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = new Shape() {

			@Override
			void methodArea() {
				System.out.println();
			}
		};
		Shape.Circle circle = shape.new Circle();
		Shape.Rectangle rectangle = shape.new Rectangle();
		shape.methodArea();
		circle.areaOfCircle();
		rectangle.areaOfRectangle();

	}

}
