
public interface BankInterface {
	public static double trasanctionFee = 100.0;
    public String name;
    public String IFSC;
    public String MICR;
    public String address;
    public Account bankAcc;
    public Account[] customerAcc;
    
	public boolean debit(Double amount) throws InsufficientFundsException, 
	InvalidAmountException;
	public boolean credit(Double amount) throws InvalidAmountException;
	public boolean addAccount(Account newuseraccount);
}
