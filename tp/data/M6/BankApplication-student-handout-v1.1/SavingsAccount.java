/**
 * There is a special feature for SavingsAccount which is the interest. This
 * would be the same to all the customers who are holding this account.
 * In order to calculate the interest we need to maintain the date instead 
 * we are going to calculate the interest for three months and the same
 * is added to the amount in the account whenever we call the calculateInterest
 * method.
 * 
 * [Note: Return true from the methods debit and credit if there no exceptions 
 * raised]
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * 
 * @version 1.0
 * 
 * 
 */

public class SavingsAccount extends Account{

	/*
	 * Think of the interest property for the savings account class. Whether 
	 * you need to make it as a static property or a non-static property.
	 * 
	 * If you think it is a non-static property, then Why not it should be a 
	 * static property?
	 */
	static double interest = 0.12;
	/**
	 * Declare the property for the interest The default of the interst is 12% per anum.
	 */

	//	Your code goes here....

	/**
	 * The following is used to create an object for the SavingsAccount with
	 * the default value as the amount.
	 * 
	 * @param amount the initial amount added to the account's amount (balance).
	 */
	public SavingsAccount(double amount) {
		//	Your code goes here....
		super(amount);
	}

	/**
	 * 
	 * This method when called have to calculate the interest based on the 
	 * amount in the account for three months and the same is added back to
	 * the amount to this account (SavingsAccount).
	 * 
	 * @throws InvalidAmountException throw this exceptions when the interest
	 * is failed in adding to the amount in this SavingsAccount.
	 * 
	 * @return true on successfully credited the interest amount into 
	 * this SavingsAccount.
	 */
	public boolean calculateInterest() throws InvalidAmountException {
		//	Your code goes here....
		double interestAmnt = (getAmount() * 1 * this.interest) / 4;
		if(interestAmnt <= 0)
		{
			throw new InvalidAmountException("Amount can't be negative or 0.");
		
		}
		return credit(interestAmnt);
		// return true;
		
	}

	/**
	 * This method returns the string version of the SavingsAccount
	 * @return the string version of the SavingsAccount object.
	 * 
	 */
	@Override
	public String toString() {
		//	Your code goes here....
		return "balance in your savings account is: "+getAmount();
	}
}
