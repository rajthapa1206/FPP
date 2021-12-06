package programmingassignment4_3;

public class SavingsAccount extends Account{
	
	private final double interestRate = 0.25;
	
	SavingsAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (interestRate/100) * baseBalance;
		return baseBalance + interest;
	}
	
}