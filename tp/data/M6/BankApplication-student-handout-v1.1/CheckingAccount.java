/**
 * 
 * This class CheckingAccount should inherit from a base class called 
 * Account and include an additional attribute of type double that 
 * represents the fee of 50/- charged per transaction for all the
 * customers who are holding this CheckingAccount.
 * 
 * The constructor of this class should set the initial amount to this account.
 * 
 * Think of whether the fee should be a static member or a non-staic member to
 * this class. If it is a non-static member, assign the default value of 50/- 
 * in the constructor. If not create a static member for fee and initialize
 * to 50/-
 * 
 * Based on the above discussion, Do you think that CheckingAccount's
 * should redefine the member functions credit and debit. If yes, what is the
 * functionality of each method. What exceptions need to be thrown from 
 * each method.
 * 
 * Note: By default return true from each method.
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar.
 * 
 * @version 1.1
 * 
 * @author Santohs Kumar M
 * Date:28 - 11 - 2020
 */

public class CheckingAccount extends Account{

	/**
	 * 
	 * A property fee to be levied on each transaction.
	 * Decide whether it should be a static or non-static
	 * 
	 */
	//	Your code goes here....
	static double fee = 50.0;
	/**
	 * This constructs the object of type CurrentAccount with the initial
	 * amount by assigning the parametr amount to the base class's (Account) 
	 * amount
	 * 
	 * @param amount this should be set to the amount property to the 
	 * base class.
	 */
	public CheckingAccount(double amount) {
		//	Your code goes here....
		super(amount);
	}

	@Override
	public boolean credit(double amount) throws InvalidAmountException
	{	
		return super.credit(amount - 50);
	}
	@Override
	public boolean debit(double amount) throws InvalidAmountException, InsufficientFundsException
	{		
		return super.debit(amount + 50);
	}

	/**
	 * This method returns the String version of this class's object.
	 * 
	 * @return the string version of this account like as follows.
	 * 
	 * balance in your checking account is: <Amount>
	 */
	@Override
	public String toString() {
		return "balance in your checking account is: "+getAmount();
	}
}