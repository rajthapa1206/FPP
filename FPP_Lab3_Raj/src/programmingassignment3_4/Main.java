package programmingassignment3_4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		double radius = random.nextDouble();
		double length = random.nextDouble();
		double width = random.nextDouble();
		double base = random.nextDouble();
		double height = random.nextDouble();
		double thirdSide = random.nextDouble();
		
		Triangle triangle = new Triangle(base, height);
		System.out.println(base);
		System.out.println(height);
		System.out.println("Area of Triangle using base and height is " + triangle.computeArea());
		Triangle triangle1 = new Triangle(base, height, thirdSide);
		System.out.println(base);
		System.out.println(height);
		System.out.println(thirdSide);
		System.out.println("Area of Triangle using 3 sides is " + triangle1.computeArea());
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println(length);
		System.out.println(width);
		System.out.println("Area of Rectangle is " + rectangle.computeArea());
		Circle circle = new Circle (radius);
		System.out.println(radius);
		System.out.println("Area of Circle is " + circle.computeArea());
		

	}

}
