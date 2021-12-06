package programmingassignment3_2;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	
	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}
	
	Account(Employee emp, AccountType acctType){
		this(emp, acctType, DEFAULT_BALANCE);
	}
	
	public String toString() {
		return "\nAccount type : " + acctType + "\nCurrent balance : " + balance ;
	}
	
	public void makeDeposit(double val) {
		balance += val;
	}
	
	public boolean makeWithdrawal(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} 
		return false;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public double getBalance() {
		return balance;
	}
}