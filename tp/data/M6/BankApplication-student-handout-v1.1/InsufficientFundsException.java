/**
 * 
 * This exception will be thrown when the amount is not sufficient to 
 * withdraw or debit from a particular Account.
 * 
 * @author N. D. V. Siva Sankar.
 * 
 * @version 1.0
 */

public class InsufficientFundsException extends Exception {
    /**
     * A new object has to be created everytime when the client wants to throw
     * an Exception of this type.
     * 
     * @param message Constructs a new exception with the specified detail message.
     */
	public InsufficientFundsException(String message) {
		super(message);
	}
}