import java.util.Scanner;

/**
 * 
 * The Account class performs the basic operations such as deposit the amount 
 * (credit) and withdraw the amount (debit) to a particular account.
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Student Name>
 * 
 * @version 1.0
 * @author Santosh Kumar M
 */

public class Account {
	double amount;
	/**
	 * The attribute amount is used to maintain the balance in an Account.
	 */
	//	Delcare the attributes below this line...

	/**
	 * The following is a constructor that sets the amount to the attribute amount
	 * of the class Account.
	 * 
	 * @param amount
	 */
	public Account(double amount) {
		//	your code goes here....
		this.amount = amount;
	}

	/**
	 * This method performs to debit the amount on this Account.
	 * 
	 * @param amount to debit from this Account.
	 * 
	 * @return true on successfully debited the amount.
	 * 
	 * @exception throw an exception called InsufficientFundsException if the
	 * amount in this Account is less than the amount to be debited with a message
	 * "Insufficient funds to withdraw the amount.".
	 * 
	 * @exception throw an exception called InvalidAmountException if the amount 
	 * is <= 0 with a message "Amount can't be negative or 0.".
	 * 
	 * The above two exceptions are user defined exceptions. These exceptions 
	 * are defined in files InsufficientFundsException and 
	 * InvalidAmountException as public classes.
	 * 
	 */
	public boolean debit(double amount) throws InsufficientFundsException, InvalidAmountException{
		//	your code goes here....
		if(this.amount < amount)
		{
			throw new InsufficientFundsException("Insufficient funds to withdraw the amount.");
		}
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount can't be negative or 0.");
		}
		this.amount -= amount;
		return true;
	}

	/**
	 * Credit the amount to this Account.
	 * 
	 * @param amount to credit to this Account.
	 * 
	 * @return true on successfully the amount is credited to this Account.
	 * 
	 * @exception throw an exception InvalidAmountException if the amount 
	 * (parameter) is <= 0 with a message "Amount can't be negative or 0".
	 */
	public boolean credit(double amount) throws InvalidAmountException{
		//	your code goes here....
		if (amount <= 0)
		{
			throw new InvalidAmountException("Amount can't be negative or 0.");
		}
		this.amount += amount;
		return true;
	}

	/**
	 * This method returns the balance amount from this Account.
	 * @return the amount from this Account object.
	 */
	public double getAmount() {
		//	your code goes here....
		return this.amount;
	}

	/**
	 * This method sets the amount to this Account.
	 * 
	 * @param amount to be set to the attribute amount.
	 */
	public void setAmount(double amount) {
		//	your code goes here....
		this.amount = amount;
	}


	/**
	 * This method returns the String version of the object.
	 * 
	 * @return the String version of this class object in the following format
	 * balance in your account is: <Amount>
	 */
	public String toString() {
		//	your code goes here....
		return "balance in your account is: "+this.getAmount();
	}

	/**
	 * The main method is used to test this Account class.
	 * 
	 * @param args the command line arguments. No need to pass any command line 
	 * arguments at the time of executing this program.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Account account = new Account(0.0);

		while (scan.hasNextLine()) {
			String tokens[] = scan.nextLine().split(" ");
			switch (tokens[0]) {
				case "account":
					account = new Account(Double.parseDouble(tokens[1]));
					System.out.println("Account created and " + account);
					break;
				case "debit":
					try {
						boolean flag = account.debit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After debit, " + account);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case "credit":
					try {
						boolean flag = account.credit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After credit, " + account);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				default:
					break;
			}
		}
		scan.close();
	}
}
