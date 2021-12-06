package programmingassignment4_5;

public class Rectangle extends ClosedCurve implements Polygon{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double computeArea() {
		return length * width;
	}
	
	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double[] getArrayOfSides() {
		return new double[] {width, width, length, length};
	}

}
