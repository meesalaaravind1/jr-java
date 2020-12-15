
public interface AccountInterface {
	public boolean debit(Double amount) throws InsufficientFundsException, 
	InvalidAmountException;
	public boolean credit(Double amount) throws InvalidAmountException;
}
