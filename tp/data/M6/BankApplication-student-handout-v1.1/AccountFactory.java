/**
 *
 * 		PELASE DON'T CHANGE THE FOLLOWING CODE. YOU CAN CHANGE 
 * 			THIS IF YOUR MENTOR ASKS YOU TO CHANGE...
 * 		
 * 	
 * Factory pattern to create objects for different classes.
 * 
 * @author Sridevi. K.
 */
public class AccountFactory {

	public AccountFactory() {

	}

	public SavingsAccount createSavingsAccount(double amount) {
		return (new SavingsAccount(amount));
	}

	public CurrentAccount createCurrentAccount(double amount) {
		return (new CurrentAccount(amount));
	}

	public CheckingAccount createCheckingAccount(double amount) {
		return (new CheckingAccount(amount));
	}

	public Account CreateAccount(String accountType, double amount) {
		accountType = accountType.toLowerCase();

		switch (accountType) {
			case "savings":
				return createSavingsAccount(amount);
			case "current":
				return createCurrentAccount(amount);
			case "checking":
				return createCheckingAccount(amount);
			default:
				return null;
		}
	}
}
