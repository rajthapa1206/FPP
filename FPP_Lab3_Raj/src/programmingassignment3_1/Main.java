package programmingassignment3_1;

public class Main {

	public static void main(String[] args) {
		Employee rajThapa = new Employee("Raj Kumar Thapa", "Raj", 150000, 2020, 11, 12);
		Account rajCheckingAccount = new Account(rajThapa, AccountType.CHECKING, 300);
		Account rajSavingAccount = new Account(rajThapa, AccountType.SAVINGS, 300);
		Account rajRetirementAccount = new Account(rajThapa, AccountType.RETIREMENT, 300);
		System.out.println(rajCheckingAccount.toString());
		System.out.println(rajSavingAccount.toString());
		System.out.println(rajRetirementAccount.toString());
	}
}