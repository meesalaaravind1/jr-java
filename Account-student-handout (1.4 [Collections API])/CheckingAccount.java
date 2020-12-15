import java.util.Scanner;

public class CheckingAccount extends Account{

	public double CHARGES = 100;
	public CheckingAccount(Double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	public CheckingAccount(String accountNumber, String accountHolderName,
			String dateOfBirth, String contactAddress,
			String email, String phoneNumber, Double amount) {
		super(accountNumber, accountHolderName, dateOfBirth, contactAddress, email, phoneNumber, amount );
	}
	
	public boolean debit(Double amount) throws InsufficientFundsException, 
		InvalidAmountException {
		if (amount <= 0){
			throw new InvalidAmountException("Amount can't be negative or 0.");
		} else if (amount > this.getAmount()){
			throw new InsufficientFundsException("Insufficient funds to withdraw the amount.");
		}
		else {
			this.setAmount(this.getAmount() - (amount + this.CHARGES));
			return true;
		}
	}
	
	public boolean credit(Double amount) throws InvalidAmountException {
	//	Your code goes here...
		if (amount <= 0){
			throw new InvalidAmountException("Amount can't be negative or 0.");
		} else{
			this.setAmount(this.getAmount() + (amount - this.CHARGES));
			return true;
		}
	}
	

}
