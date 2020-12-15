import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) throws FileNotFoundException {

		//	Savings Account
//		System.out.println("\nSavings Account");
		// PrintStream o = new PrintStream(new File("saoutput00.txt"));
	File myObj = new File("saoutput00.txt");
      Scanner myReader = new Scanner(myObj);
      String output = "";
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // System.out.println(data);
        output += data + "\n";
      }
      myReader.close();
		// System.setOut(o);
		String youroutput = "";
		for (int i = 0; i < 1; i++) {
			FileReader fr = new FileReader("sainput00.txt");
			Scanner scan = new Scanner(fr);
			
			SavingsAccount account = null;
			
//			if (i == 0) {
//				account = new SavingsAccount(0.0);
//			} else if (i == 1) {
//				account = new CurrentAccount(0.0);
//			} else if (i == 0) {
//				account = new CheckingAccount(0.0);
//			} 

			while (scan.hasNextLine()) {
				String tokens[] = scan.nextLine().split(" ");
				switch (tokens[0]) {
					case "account":
						tokens = tokens[1].split(",");
						if (tokens.length == 1)
//							account = new Account(Double.parseDouble(tokens[1]));
							account = new SavingsAccount(0.0);
						else {
							account = new SavingsAccount(
								tokens[0], tokens[1], tokens[2], tokens[3], tokens[5],
								tokens[5], Double.parseDouble(tokens[6]));
						}
						System.out.println("Account created and " + account);
						break;
					case "debit":
						try {
							boolean flag = account.debit(Double.parseDouble(tokens[1]));
							if (flag)
								youroutput += "After debit, " + account + "\n";
								// System.out.println("After debit, " + account);
						} catch(Exception ex) {
							System.out.println(ex.getMessage());
						}
						break;
					case "credit":
						try {
							boolean flag = account.credit(Double.parseDouble(tokens[1]));
							if (flag)
								youroutput += "After credit, " + account + "\n";
								// System.out.println("After credit, " + account);
						} catch(Exception ex) {
							System.out.println(ex.getMessage());
						}
						break;
					case "interest":
						try {
							boolean flag = account.CalculateInterest();
							if (flag)
								youroutput += "After interest, " + account + "\n";
								// System.out.println("After interest, " + account);
						} catch(Exception ex) {
							System.out.println(ex.getMessage());
						}
						break;
					default:
						break;
				}
			}
			scan.close();
			System.out.println(youroutput);
		}
		if(output.strip().equals(youroutput.strip())){
			// System.out.println("Testcase Passed");
		} else {
			// System.out.println("Testcase Failed");
			// System.out.println("Expected Output is: ");
			System.out.println(output);
		}
		
		//  Current Account
//		System.out.println("\nCurrent Account");
		// o = new PrintStream(new File("cuaoutput00.txt"));
	 myObj = new File("cuaoutput00.txt");
     myReader = new Scanner(myObj);
     output = "";
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // System.out.println(data);
        output += data + "\n";
      }
      myReader.close();
		// System.setOut(o);
		youroutput = "";
			for (int i = 0; i < 1; i++) {
				FileReader fr = new FileReader("cuainput00.txt");
				Scanner scan = new Scanner(fr);
				
				CurrentAccount account = null;
				
//				if (i == 0) {
//					account = new SavingsAccount(0.0);
//				} else if (i == 1) {
//					account = new CurrentAccount(0.0);
//				} else if (i == 0) {
//					account = new CheckingAccount(0.0);
//				} 

				while (scan.hasNextLine()) {
					String tokens[] = scan.nextLine().split(" ");
					switch (tokens[0]) {
						case "account":
							tokens = tokens[1].split(",");
							if (tokens.length == 1)
//								account = new Account(Double.parseDouble(tokens[1]));
								account = new CurrentAccount(0.0);
							else {
								account = new CurrentAccount(
									tokens[0], tokens[1], tokens[2], tokens[3], tokens[5],
									tokens[5], Double.parseDouble(tokens[6]));
							}
							System.out.println("Account created and " + account);
							break;
						case "debit":
							try {
								boolean flag = account.debit(Double.parseDouble(tokens[1]));
								if (flag)
									youroutput += "After debit, " + account + " overdraft " + account.getOverDraft() + "\n";
									// System.out.println("After debit, " + account + " overdraft " + account.getOverDraft());
							} catch(Exception ex) {
								System.out.println(ex.getMessage());
							}
							break;
						case "credit":
							try {
								boolean flag = account.credit(Double.parseDouble(tokens[1]));
								if (flag)
									youroutput += "After credit, " + account + " overdraft " + account.getOverDraft() + "\n";
									// System.out.println("After credit, " + account + " overdraft " + account.getOverDraft());
							} catch(Exception ex) {
								System.out.println(ex.getMessage());
							}
							break;
						default:
							break;
					}
				}
				scan.close();
				System.out.println(youroutput);
			}
			if(output.strip().equals(youroutput.strip())){
				// System.out.println("Testcase Passed");
			} else {
				// System.out.println("Testcase Failed");
				// System.out.println("Expected Output is: ");
				System.out.println(output);
			}
			
		//	Checking Account
//		System.out.println("\nChecking Account");
		// o = new PrintStream(new File("chaoutput00.txt"));
		myObj = new File("chaoutput00.txt");
      myReader = new Scanner(myObj);
      output = "";
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // System.out.println(data);
        output += data + "\n";
      }
      myReader.close();
		// System.setOut(o);
		youroutput = "";
		for (int i = 0; i < 1; i++) {
			FileReader fr = new FileReader("chainput00.txt");
			Scanner scan = new Scanner(fr);
			
			CheckingAccount account = null;
			
//			if (i == 0) {
//				account = new SavingsAccount(0.0);
//			} else if (i == 1) {
//				account = new CurrentAccount(0.0);
//			} else if (i == 0) {
//				account = new CheckingAccount(0.0);
//			} 

			while (scan.hasNextLine()) {
				String tokens[] = scan.nextLine().split(" ");
				switch (tokens[0]) {
					case "account":
						tokens = tokens[1].split(",");
						if (tokens.length == 1)
//							account = new Account(Double.parseDouble(tokens[1]));
							account = new CheckingAccount(0.0);
						else {
							account = new CheckingAccount(
								tokens[0], tokens[1], tokens[2], tokens[3], tokens[5],
								tokens[5], Double.parseDouble(tokens[6]));
						}
						System.out.println("Account created and " + account);
						break;
					case "debit":
						try {
							boolean flag = account.debit(Double.parseDouble(tokens[1]));
							if (flag)
								youroutput += "After debit, " + account + "\n";
								// System.out.println("After debit, " + account);
						} catch(Exception ex) {
							System.out.println(ex.getMessage());
						}
						break;
					case "credit":
						try {
							boolean flag = account.credit(Double.parseDouble(tokens[1]));
							if (flag)
								youroutput += "After credit, " + account + "\n";
								// System.out.println("After credit, " + account);
						} catch(Exception ex) {
							System.out.println(ex.getMessage());
						}
						break;
					default:
						break;
				}
			}
			scan.close();
			System.out.println(youroutput);
		}
		if(output.strip().equals(youroutput.strip())){
			// System.out.println("Testcase Passed");
		} else {
			// System.out.println("Testcase Failed");
			// System.out.println("Expected Output is: ");
			System.out.println(output);
		}
		/*****************************************************************************************/
		
	}
}
