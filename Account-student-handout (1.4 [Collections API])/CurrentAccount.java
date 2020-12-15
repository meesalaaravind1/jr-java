public class CurrentAccount extends Account {
	private static double fixedOverDraft = 10000.0;
	private double overDraftAmount;

	public CurrentAccount(String accountNumber, String accountHolderName, String dateOfBirth, String phoneNumber, double amount) {
		super(accountNumber, accountHolderName, dateOfBirth,contactAddress, email, phoneNumber, amount);
		this.overDraftAmount = fixedOverDraft;
	}

	public boolean credit(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Amount can't be negative or 0.");
		}
		if(this.overDraftAmount < fixedOverDraft) {
			if(fixedOverDraft - this.overDraftAmount >= amount) {
				this.overDraftAmount = amount;
			}
			else{
				this.setAmount(amount - (fixedOverDraft - this.overDraftAmount));
				this.overDraftAmount = overDraftAmount;
			}
		}
		else if(this.overDraftAmount == fixedOverDraft) {
			this.setAmount(amount);
		}
		return true;
	}

	public boolean debit(double amount) throws InsufficientFundsException,InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Amount can't be negative or 0.");
		}
		if(this.getAmount() - this.overDraftAmount < amount) {
			throw new InsufficientFundsException("Insufficient funds to withdraw the amount");
		}

		if(this.getAmount() >= amount) {
			this.setAmount(this.getAmount() - amount);
		}
		else{
			if(this.getAmount() > 0) {
				this.overDraftAmount -= (amount - this.getAmount());
				this.setAmount(0);
			}
			else if(this.getAmount() == 0) {
				this.overDraftAmount -= amount;
			}
		}
		return true;
	}
}
// public class CurrentAccount extends Account {

// 	private double overdraft = 10000;
// 	public CurrentAccount(double amount) {
// 		super(amount);
// 		// TODO Auto-generated constructor stub
// 	}
	
// 	public CurrentAccount(String accountNumber, String accountHolderName,
// 			String dateOfBirth, String contactAddress,
// 			String email, String phoneNumber, double amount) {
// 		super(accountNumber, accountHolderName, dateOfBirth, contactAddress, email, phoneNumber, amount );
// 	}
	
// 	/**
//      * @return String return the accountNumber
//      */
//     public double getOverDraft() {
//         return overdraft;
//     }

//     /**
//      * @param accountNumber the accountNumber to set
//      */
//     public void setOverDraft(double overdraft) {
//         this.overdraft = overdraft;
//     }
	
// 	public boolean debit(double amount) throws InsufficientFundsException, 
// 		InvalidAmountException {
// 		if (amount <= 0){
// 			throw new InvalidAmountException("Amount can't be negative or 0.");
// 		} else if (amount > (this.getAmount() + this.overdraft)){
// 			throw new InsufficientFundsException("Insufficient funds to withdraw the amount.");
// 		} 
		
// 		if (checkoverdraft() == false){
// 			payoverdraft();
// 		}
		
// 		if (checkoverdraft()) {
// 			if (amount < overdraft) {
// 				this.overdraft -= amount;
// 			} else {
// 				this.overdraft -= amount;
// 				if (this.overdraft < 0) {
// 					this.setAmount(this.getAmount() + this.overdraft);
// 					this.setOverDraft(0);
// 				}
// 			}
// 		} else {
// 			if (this.getAmount() >= 10000) {
// 				this.payoverdraft();
// 			}
// 		}
// 		return true;
// 	}
	
// 	public boolean credit(double amount) throws InvalidAmountException {
// 		//	Your code goes here...
// 		if (amount <= 0){
// 			throw new InvalidAmountException("Amount can't be negative or 0.");
// 		} else{
// 			this.setAmount(this.getAmount() +  amount);
// 			return true;
// 		}
// 	}
	
// 	public boolean checkoverdraft() {
// 		if (this.overdraft > 0) {
// 			return true;
// 		}
// 		return false;
// 	}

// 	public boolean payoverdraft() {
// 		this.overdraft = 10000;
// 		this.setAmount(this.getAmount() - 10000);
// 		return true;
// 	}
// }
