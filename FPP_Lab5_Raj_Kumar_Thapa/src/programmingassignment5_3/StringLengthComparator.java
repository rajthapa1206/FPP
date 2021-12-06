package programmingassignment5_3;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{

    boolean ascending;
    StringLengthComparator(){
    	this.ascending = true;
    }
	StringLengthComparator(boolean ascending) {
		this.ascending = ascending;
	}
	
	@Override
	public int compare(String s1, String s2) {
		return ascending ? (s1.length() - s2.length())   :
			(s2.length() - s1.length());
	}
	 
}