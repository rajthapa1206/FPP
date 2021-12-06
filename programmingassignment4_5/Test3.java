package programmingassignment4_5;

public class Test3 {

	public static void main(String[] args) {
		Polygon[] polygons = { new Square(3), new Triangle(4, 5, 6),
				new Rectangle(3, 4)
		};
		for(Polygon polygon : polygons) {
			System.out.println("For this " + polygon.getClass().getSimpleName());
			System.out.println("  Perimeter =" + polygon.computePerimeter());
		}
	}
}