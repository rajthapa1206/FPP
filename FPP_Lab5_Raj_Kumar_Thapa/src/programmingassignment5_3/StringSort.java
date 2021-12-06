package programmingassignment5_3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;

	public StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}
	
	public String[] lambdaStringSort(String[] arr) {
	  Arrays.sort(arr, (s1, s2)-> s1.length() - s2.length());
	  return arr;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}
}