package programmingassignment4_5;

public interface Polygon {
	
	abstract public double[] getArrayOfSides();
	public int getNumberOfSides();
	public static double sum(double[] arr) {
		double sum = 0;
		for (double side : arr) {
			sum += side;
		}
		return sum;
	}
	
	default public double computePerimeter() {
		
		return sum(getArrayOfSides()) ;
	}
	
}