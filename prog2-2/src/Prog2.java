import java.util.Random;
//Assignment for prog2-2
public class Prog2 {
	public static void main(String[] args) {
	    int x = getRandomNumberUsingNextInt(1, 9);
	    int y = getRandomNumberUsingNextInt(3, 14);
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(Math.pow(Math.PI, x));
	    System.out.println(Math.pow(Math.PI, y));
	}
	//function to generate a Random Number passing minimum and maximum value()
	public static int getRandomNumberUsingNextInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min + 1) + min;
	}
}