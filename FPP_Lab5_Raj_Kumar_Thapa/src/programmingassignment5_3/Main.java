package programmingassignment5_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] testStrings = { "luffy", "zoro", "naruto", "shikamaru", "lee" };
		StringSort ss = new StringSort(new StringLengthComparator(true));
		ss.stringSort(testStrings);
		System.out.println(Arrays.asList(testStrings));
	}
}