package programmingassignment3_4;

public class Circle {
	
	public double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}