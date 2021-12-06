package programmingassignment4_7;

public class RetirementAccount extends Account {
	
	RetirementAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	@Override
	public boolean makeWithdrawal(double amount) {
		if (amount <= super.getBalance()) {
			double balance = super.getBalance() - (amount + 0.02 * super.getBalance());
			super.setBalance(balance);
			System.out.println("Amount " + amount + " is withdrawan from " + getAcctType() + " account of " + super.getEmployee().getName());
			return true;
		} 
		else {
			System.out.println("Not sufficient balance for withdrawal in " + getAcctType() + " account of " + super.getEmployee().getName());	
			return false;
		}
	}
	
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
}