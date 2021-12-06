package programmingassignment3_4;

public class Triangle {
	
	private double base;
	private double height;
	private double thirdSide;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(double a, double b, double c) {
		double[] nums = {a, b, c};
		this.base = getMax(nums);
		double s = getSemiPerimeter(a, b, c);
		double area = s * Math.sqrt(Math.abs(s * (s-a) * (s-b) *(s-c)));
		this.height = (area * 2 )/ base;
		for (double num : nums) {
			if (this.base != num || this.height != num) {
				this.thirdSide = num;		
			}
		}	
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getThirdSide() {
		return thirdSide;
	}
	
	public double computeArea() {
		return base * height * 0.5;
	}
	
	public double getSemiPerimeter(double a, double b, double c) {
		return (a + b + c)/2;
	}
	
	public double getMax(double[] nums) {
		double max = 0.0;
		for(double n : nums) {
			max = (max < n) ? n : max;
		}
		return max;
	}
}