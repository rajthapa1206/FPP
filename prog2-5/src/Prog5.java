import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {	
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a string: ");
			System.out.println("Reverse of your entered word is: " + getReverse(input.nextLine()));
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	//function to reverse the string
	public static String getReverse(String word) {	
		int length = word.length();	
		StringBuilder finalWord = new StringBuilder();
		for(int i = length - 1; i >= 0; i--) {		
			finalWord.append(word.charAt(i));
		}
		return finalWord.toString();
	}
}