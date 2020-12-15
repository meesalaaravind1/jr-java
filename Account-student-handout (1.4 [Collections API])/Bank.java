import java.util.Collections;
import java.util.ArrayList;

public class Bank implements BankInterface{
    private static double trasanctionFee = 100.0;
    private String name;
    private String IFSC;
    private String MICR;
    private String address;
    private Account bankAcc;
    private ArrayList<Account> customerAcc = new ArrayList<Account>();
    
    public Bank(double trasanctionFee, String name, String IFSC, String MICR, String address, Account bankAcc, ArrayList<Account> customerAcc = new ArrayList<Account>()) {
    	this.trasanctionFee = trasanctionFee;
    	this.name = name;
    	this.IFSC = IFSC;
    	this.MICR = MICR;
    	this.address = address;
    	this.bankAcc = bankAcc;
    	this.customerAcc = customerAcc;
    }
    
    public boolean addAccount(Account newuseraccount) {
    	customerAcc.add(newuseraccount);
    	return true;
    }

    public boolean credit(double amount, String accountNumber) throws InvalidAmountException{
        for(int i = 0; i < customerAcc.length; i++) {
            if(customerAcc[i].getAccountNumber().equals(accountNumber)) {
                if(customerAcc[i].getClass().getName() == "CheckingAccount") {
                    boolean flag = customerAcc[i].credit(amount);
                    if(flag) {
                        this.bankAcc.setAmount(this.bankAcc.getAmount() + trasanctionFee);
                        break;
                    }
                    return flag;
                }else{
                    customerAcc[i].credit(amount);
                    break;
                }
            }
        }
        return true;
    }

    public boolean debit(double amount, String accountNumber) throws InsufficientFundsException,InvalidAmountException{
        for(int i = 0; i < customerAcc.length; i++) {
            if(customerAcc[i].getAccountNumber().equals(accountNumber)) {
                if(customerAcc[i].getClass().getName() == "CheckingAccount") {
                    boolean flag = customerAcc[i].debit(amount);
                    if(flag) {
                        this.bankAcc.setAmount(this.bankAcc.getAmount() - trasanctionFee);
                        break;
                    }
                    else{
                        customerAcc[i].debit(amount);
                    }
                }
            }
            return true;
        }
    }
    
    public ArrayList<Account> amountSort() {
    	return Collections.sort(customerAcc, Collections.reverseOrder());
    }
}