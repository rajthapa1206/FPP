
public class Prog2_8 {

	public static void main(String[] args) {
		int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(arrayOfInts));
				
	}
	
	static int min(int[] arrayOfInts) {
		int min = 999999999;
		for (int n : arrayOfInts) {
			min = (n < min) ? n : min;
		}
		return min;
	}
}
