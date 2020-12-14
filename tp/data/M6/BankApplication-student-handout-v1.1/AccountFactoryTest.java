import java.util.Scanner;

/**
 * 
 * 		PELASE DON'T CHANGE THE FOLLOWING CODE. YOU CAN CHANGE 
 * 			THIS IF YOUR MENTOR ASKS YOU TO CHANGE...
 * 		
 * 	
 * This class is used to test the different classes that have been implemented
 * as part of this module Banking application.
 * 
 * @author Sridevi.
 * @author N. D. V. Siva Sankar.
 */
public class AccountFactoryTest {

	/**
	 * Main method to test the three accounts that you have created so far.
	 * 
	 * @param args the command line arguments and this program doesn't require
	 * any of these.
	 */
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] tokens = scan.nextLine().split(" ");
		AccountFactory accountFactory = new AccountFactory();
		switch(tokens[0]) {
			case "SavingsAccount":
				SavingsAccount savingsAccount = 
					accountFactory.createSavingsAccount(Double.parseDouble(tokens[1]));
				System.out.println("Savings account created, " + savingsAccount);
				testSavingsAccount(savingsAccount, scan);
				break;
			case "CurrentAccount":
				CurrentAccount currentAccount = 
					accountFactory.createCurrentAccount(Double.parseDouble(tokens[1]));
				System.out.println("Current account created, " + currentAccount);
				testCurrentAccount(currentAccount, scan);
				break;
			case "CheckingAccount":
				CheckingAccount checkingAccount = 
					accountFactory.createCheckingAccount(Double.parseDouble(tokens[1]));
				System.out.println("Checking account created, " + checkingAccount);
				testCheckingAccount(checkingAccount, scan);
				break;
			default:
				break;
		}
	}

	public static void testSavingsAccount(SavingsAccount savingsAccount, 
								Scanner scan) {
		while (scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(" ");
			switch(tokens[0]) {
				case "debit":
					try {
						boolean flag = savingsAccount.debit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After debit, " + savingsAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case "credit":
					try {
						boolean flag = savingsAccount.credit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After credit, " + savingsAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case "calculateInterest":
					try {
						boolean flag = savingsAccount.calculateInterest();
						if (flag)
							System.out.println("After credit, " + savingsAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				default:
					break;
			}
		}
	}

	public static void testCheckingAccount(CheckingAccount checkingAccount, 
								Scanner scan) {
		while (scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(" ");
			switch(tokens[0]) {
				case "debit":
					try {
						boolean flag = checkingAccount.debit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After debit, " + checkingAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case "credit":
					try {
						boolean flag = checkingAccount.credit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After credit, " + checkingAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				default:
					break;
			}
		}
	}

	public static void testCurrentAccount(CurrentAccount currentAccount,
								Scanner scan) {
		while (scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(" ");
			switch(tokens[0]) {
				case "debit":
					try {
						boolean flag = currentAccount.debit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After debit, " + currentAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case "credit":
					try {
						boolean flag = currentAccount.credit(Double.parseDouble(tokens[1]));
						if (flag)
							System.out.println("After credit, " + currentAccount);
					} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					break;
				default:
					break;
			}
		}
	}
}
