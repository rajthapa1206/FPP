package programmingassignment4_7;

import java.time.LocalDate;


public class Employee implements Comparable<Employee>{

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.accounts = new AccountList();
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDay() {
		return hireDate;
	}
	
	public void createNewChecking(double startBalance) {
		Account acct = new CheckingAccount(this, startBalance);
		accounts.add(acct);
	}
	
	public void createNewSavings(double startBalance) {
		Account acct = new SavingsAccount(this, startBalance);
		accounts.add(acct);
	}
	
	public void createNewRetirement(double startBalance) {
		Account acct = new RetirementAccount(this, startBalance);
		accounts.add(acct);
	}

	public void deposit(int acctIndex, double amt){
		Account selected = accounts.get(acctIndex);
		selected.makeDeposit(amt);
	}

	public void withdraw(int acctIndex, double amt){	
		Account selected = accounts.get(acctIndex);
		selected.makeWithdrawal(amt);
	}
		
	public String getFormattedAcctInfo() {
		String formattedAccountInfo = String.format("%nACCOUNT INFO FOR %s: %n %n", name);
		int size = accounts.size();
		for(int i = 0; i < size; i++) {
			if (accounts.get(i) != null) {
				formattedAccountInfo += accounts.get(i).toString();	
			}	
		}
		return formattedAccountInfo;
	}
	
	public MyStringList getNamesOfAccounts() {
		MyStringList accountNames = new MyStringList();
		int size = accounts.size();
		for (int i = 0; i < size; i++) {
			accountNames.add(accounts.get(i).getAcctType().toString());
		}
		return accountNames;
	}
	
	public double getLargestAccount() {
		double largestAccount = accounts.getLargest();
		return largestAccount;
	}
	
	@Override
	public int compareTo(Employee emp) {
		if (this.getLargestAccount() > emp.getLargestAccount())
			return 1;
		else if (this.getLargestAccount() < emp.getLargestAccount())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return this.getName() + " : " + this.getLargestAccount();
	}

	
}