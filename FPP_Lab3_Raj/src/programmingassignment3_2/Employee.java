package programmingassignment3_2;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDay() {
		return hireDate;
	}
	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}
	
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt){	
		switch (acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}
		
	public String getFormattedAcctInfo() {
		// implement
		String formattedAccountInfo = String.format("%nACCOUNT INFO FOR %s: %n %n", name);
		if(checkingAcct != null) {
			formattedAccountInfo += checkingAcct.toString();
		}
		if(savingsAcct != null) {
			formattedAccountInfo += savingsAcct.toString();
		}	
		if(retirementAcct != null) {
			formattedAccountInfo += retirementAcct.toString();
		}			
		return formattedAccountInfo;
	}
}