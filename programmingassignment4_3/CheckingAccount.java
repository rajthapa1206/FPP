package programmingassignment4_3;

public class CheckingAccount extends Account{
	
	private double monthlyServiceCharge = 5;
	
	CheckingAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - monthlyServiceCharge;
	}
	
}