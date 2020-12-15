
public class SavingsAccount extends Account {

	private static double INTEREST_RATE = 0.11;
	
	public SavingsAccount(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	public boolean debit(double amount) throws InsufficientFundsException, 
			InvalidAmountException {
		if (amount <= 0){
			throw new InvalidAmountException("Amount can't be negative or 0.");
		} else if (amount > this.getAmount()){
			throw new InsufficientFundsException("Insufficient funds to withdraw the amount.");
		}
		else {
			this.setAmount(this.getAmount() - amount);
			return true;
		}
	}

	public boolean credit(double amount) throws InvalidAmountException {
		//	Your code goes here...
		if (amount <= 0){
			throw new InvalidAmountException("Amount can't be negative or 0.");
		} else{
			this.setAmount(this.getAmount() + amount);
			return true;
		}
	}
	
	public SavingsAccount(String accountNumber, String accountHolderName,
			String dateOfBirth, String contactAddress,
			String email, String phoneNumber, double amount) {
		super(accountNumber, accountHolderName, dateOfBirth, contactAddress, email, phoneNumber, amount );
	}
	
	public boolean CalculateInterest() {
		this.setAmount(this.getAmount()  + (this.getAmount() * INTEREST_RATE));
		return true;
	}
}
