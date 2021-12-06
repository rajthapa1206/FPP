package programmingassignment4_3;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		size = 0;
		strArray = new String[INITIAL_LENGTH];
	}
	
	public void add(String s){
		//adds s to the end of the underlying array
		if(size >= strArray.length)
            resize();
		strArray[size] = s;
        size++;
	}
	
	public String get(int i){
		//retrieves the String at the ith position in the underlying array
		return strArray[i];
	}
	
	public boolean find(String s){
		//returns true if String s is found in the array, false otherwise
		for (String value : strArray) {
			if (value.equals(s)) {
				return true; 
			}
		}
		return false;
	}
	
	public boolean remove(String s){
		//removes first occurrence of String s if it is found in the underlying array if found, returns true; if not found returns false
		boolean result = find(s);
		if (result) {
			System.out.println("Deleting...");
            size--;
            for(int i = 0; i <= strArray.length; i++){
                if(strArray[i].equals(s)){
                	strArray[i] = null;
                    break;
                }
            }
		}
		return result;
	}
	
	private void resize(){
		System.out.println("Resizing...");
		int newSize = size*2;
		String[] strArrayCloned = new String[newSize];
		System.arraycopy(strArray, 0, strArrayCloned, 0, size());
		strArray = strArrayCloned;
	}
	
	public String toString(){
		//returns a String representation of the underlying array here is a typical output: [Bob, Steve, Susan, Mark, Dave]
		return Arrays.toString(deleteNulls(strArray));
	}
	
	public int size() {
		//returns the next open position in the underlying array – this is precisely the number of Strings that have been added minus the number of String that have been removed.
		return size;
	}
	
	// Count elements in the array
	public int countNotNullElements(String[] array) {
		int count = 0;
		for (String element : array) {
			if (element != null) {
				count++;
			}
		}
		return count;
	}
			
	// Delete nulls from array
	public String[] deleteNulls(String[] array) {
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

	public static void main(String[] args){
		 MyStringList l = new MyStringList();
	        l.add("Bob");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Steve");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Susan");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Mark");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.add("Dave");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.remove("Mark");
	        System.out.println("The list of size " + l.size() + " is " + l);
	        l.remove("Bob");
	        System.out.println("The list of size " + l.size() + " is " + l);
	}
}