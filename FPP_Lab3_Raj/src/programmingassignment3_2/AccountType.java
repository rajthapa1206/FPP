package programmingassignment3_2;

public enum AccountType { 
	CHECKING("checking"), 
	SAVINGS("savings"), 
	RETIREMENT("retirement") ;
	
	public final String accountType;
	
	private AccountType(String accountType) {
		this.accountType = accountType;
	}

}