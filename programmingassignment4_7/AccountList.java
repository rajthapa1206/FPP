package programmingassignment4_7;

import java.util.Arrays;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] accounts; 
	private int size;
	
	public AccountList() {
		size = 0;
		accounts = new Account[INITIAL_LENGTH];
	}
	
	public void add(Account acc){
		//adds s to the end of the underlying array
		if(size >= accounts.length)
            resize();
		accounts[size] = acc;
        size++;
	}
	
	public Account get(int i){
		//retrieves the String at the ith position in the underlying array
		return accounts[i];
	}
	
	public boolean find(Account acc){
		//returns true if String s is found in the array, false otherwise
		for (Account value : accounts) {
			if (value.equals(acc)) {
				return true; 
			}
		}
		return false;
	}
	
	public boolean remove(Account acc){
		//removes first occurrence of String s if it is found in the underlying array if found, returns true; if not found returns false
		boolean result = find(acc);
		if (result) {
			System.out.println("Deleting...");
            size--;
            for(int i = 0; i <= accounts.length; i++){
                if(accounts[i].equals(acc)){
                	accounts[i] = null;
                    break;
                }
            }
		}
		return result;
	}
	
	private void resize(){
		System.out.println("Resizing...");
		int newSize = size*2;
		Account[] accountsCloned = new Account[newSize];
		System.arraycopy(accounts, 0, accountsCloned, 0, size());
		accounts = accountsCloned;
	}
	
	public String toString(){
		//returns a String representation of the underlying array here is a typical output: [Bob, Steve, Susan, Mark, Dave]
		return Arrays.toString(deleteNulls(accounts));
	}
	
	public int size() {
		//returns the next open position in the underlying array – this is precisely the number of Strings that have been added minus the number of String that have been removed.
		return size;
	}
	
	// Count elements in the array
	public int countNotNullElements(Account[] array) {
		int count = 0;
		for (Account element : array) {
			if (element != null) {
				count++;
			}
		}
		return count;
	}
			
	// Delete nulls from array
	public Account[] deleteNulls(Account[] array) {
		Account[] resultWithoutNulls = new Account[countNotNullElements(array)];
		int i = 0;
		for (Account value : resultWithoutNulls) {
			if (value != null) {
				resultWithoutNulls[i] = value;
				++i;
			}
		}
		return resultWithoutNulls;
	}

	public double getLargest() {
		double max = 0.0;
		for (int i = 0; i < accounts.length; i++){
			if(accounts[i] != null) {
				max = (max < accounts[i].getBalance()) ? accounts[i].getBalance() : max;	
			}
		}
		return max;
	}
	
}