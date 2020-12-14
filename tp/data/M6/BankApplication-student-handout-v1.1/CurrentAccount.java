/**
 * Derived class CurrentAccount which should inherit the functionality
 * of the Account but this Along with the base class functionality, this
 * CurrentAccount also includes the maximum overdraft limit which is
 * 10000.0
 * 
 * Think of whether the overdraft should be a static member or a non-staic 
 * member to this class. If it is a non-static member, assign the default 
 * value of 10000/- in the constructor. If not create a static member for 
 * overdraft and initialize to 10000.0/-
 * 
 * CurrentAccount should redefine member function debit, so that the
 * account holder can withdraw money upto a maximum of overdraft limit
 * if the balance is below 0.
 * 
 * [Note: An overdraft occurs when withdrawals from this account exceed
 * the available balance which gives us the negative balance in this account].
 * 
 * Note: You are free to add more attributes in the constructor 
 * without passing the parameters to the constructor.
 * 
 * [Note: Return true from the methods debit and credit if there no exceptions 
 * raised]
 * @author Sridevi
 * @author N. D. V. Siva Sankar
 * 
 * @version 1.1
 * 
 * @author Santosh Kumar M
 * Date: 28 - 11 - 2020
 */

public class CurrentAccount extends Account{

	/**
	 * Delcare an attribute for overdraft which is of type double and
	 * assign a default value as 10000.0.
	 */
	static double overdraftLimit = 10000.0;
	 // Your code goes here...

	/**
	 * This constructs the object of type CurrentAccount with the initial
	 * amount by assigning the parameter amount to the base class's (Account) amount
	 *
	 * @param amount this should be set to the amount property to the base class.
	 */
	public CurrentAccount(double amount) {
		//	Your code goes here....
		super(amount);
	}

	@Override
	public boolean debit(double amount)throws InvalidAmountException, InsufficientFundsException
	{
		if((getAmount() + this.overdraftLimit) < amount)
		{
			throw new InsufficientFundsException("Insufficient funds to withdraw the amount.");
		} 
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount can't be negative or 0.");
		}
		double amnt = getAmount() - amount;
		super.setAmount(amnt);
		return true;
	}
	@Override
	public boolean credit(double amount) throws InvalidAmountException
	{
		return super.credit(amount);
	}
	/**
	 * This method returns the string version of the CurrentAccount
	 * 
	 * @return the string version of the CurrentAccount object in the 
	 * following way.
	 * 		balance in your current account is: <Amount>
	 * 
	 */
	@Override
	public String toString() {
		return "balance in your current account is: "+getAmount() ;
	}
}