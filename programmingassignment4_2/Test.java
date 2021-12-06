package programmingassignment4_2;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4, 5, 6),
								 new Square(3),
								 new Rectangle(3, 7),
								 new Circle(3)};
		
		for(ClosedCurve cc : objects) {
			switch (cc.getClass().getSimpleName()) {
			case "Triangle":
				System.out.println("The area of this Triangle is " + cc.computeArea());
				break;
			case "Square":
				System.out.println("The area of this Square is " + cc.computeArea());
				break;
			case "Rectangle":
				System.out.println("The area of this Rectangle is " + cc.computeArea());
				break;
			case "Circle":
				System.out.println("The area of this Circle is " + cc.computeArea());
				break;
			}
				
		}
    
	}

}