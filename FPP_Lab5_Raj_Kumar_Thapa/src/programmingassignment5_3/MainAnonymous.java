package programmingassignment5_3;

import java.util.Arrays;

public class MainAnonymous {

	public static void main(String[] args) {
		String[] testStrings = { "luffy", "zoro", "naruto", "shikamaru", "lee" }; 
		StringSort ss = new StringSort(new StringLengthComparator(true) {
			@Override
			public int compare(String s1, String s2) {
				return ascending ? (s1.length() - s2.length())   :
					(s2.length() - s1.length());
			}
		});
		ss.stringSort(testStrings);
		System.out.println(Arrays.asList(testStrings));
	}
}