public class Prog3 {

	public static void main(String[] args) {
		float x = 1.27f;
		float y = 3.881f;
		float z = 9.6f;
		float sum = x + y + z;
		int castSum = (int) (sum);
		int roundSum = Math.round(sum);
		System.out.println("The type casted sum of " + x + ", " + y + ", " + z + " is " + castSum);
		System.out.println("The rounded sum of " + x + ", " + y + ", " + z + " is " + roundSum);
	}
}
