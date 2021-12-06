package programmingassignment4_7;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	
	Account(Employee emp, double balance){
		employee = emp;
		this.balance = balance;
	}
	
	Account(Employee emp){
		this(emp, DEFAULT_BALANCE);
	}
	
	public String toString() {
		return "\nAccount type : " + getAcctType() + "\nCurrent balance : " + getBalance() ;
	}
	
	public void makeDeposit(double val) {
		balance += val;
		System.out.println("$" + val + " has been deposited in the " + getAcctType() + " account of " + employee.getName());
	}
	
	public boolean makeWithdrawal(double amount) {
		if (amount <= balance) {
			balance -= amount;	
			System.out.println("Amount " + amount + " is withdrawan from " + getAcctType() + " account of " + employee.getName());
			return true;
		} 
		System.out.println("Not sufficient balance for withdrawal in " + getAcctType() + " account of " + employee.getName());
		return false;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public AccountType getAcctType() {
		return null;
	}
	
	protected void setBalance(double amount) {
		balance = amount;
	}
}