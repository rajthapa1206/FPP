package programmingassignment4_4;

public class Test2 {
	public static void main (String[] args) {
		Polygon[] polygon = { new Square(3),new Triangle(4, 5, 6),
				new Rectangle(3, 4)};
		for(Polygon object : polygon) {
				System.out.println("For this" + object.getClass().getSimpleName());
				System.out.println("   Number of sides = " + object.getNumberOfSides());
				System.out.println("   Perimeter = " + object.computePerimeter());
			}
		}
}
