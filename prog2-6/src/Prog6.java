import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		String[] array = {"horse", "dog", "cat", "horse", "dog"};
		System.out.println(Arrays.toString(removeDups(array)));
	}
	
	// removes duplicate value from an array
	public static String[] removeDups(String[] inputArray) {
		String[] resultArray = new String[inputArray.length];
		
		for (int i = 0; i < inputArray.length; i++) {
			if (!checkPresent(resultArray, inputArray[i])) {
				resultArray[i] = inputArray[i];			
			}
		}
	 	return deleteNulls(resultArray);
	}
	
	// checks if value is present in given array
	public static boolean checkPresent(String[] array, String value) {
		for (String element : array) {
			if (value.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	// Count elements in the array
		public static int countNotNullElements(String[] array) {
			int count = 0;
			for (String element : array) {
				if (element != null) {
					count++;
				}
			}
			return count;
		}
		
	// Delete nulls from array
	public static String[] deleteNulls(String[] array) {
		String[] resultWithoutNulls = new String[countNotNullElements(array)];
		int i = 0;
		for (String value : array) {
			if (value != null) {
				resultWithoutNulls[i] = value;
				++i;
			}
		}
		return resultWithoutNulls;
	}
}
