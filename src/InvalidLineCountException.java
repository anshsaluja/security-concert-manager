package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * the seat is already taken by the people in concert.
 */
public class InvalidLineCountException extends Exception {
	/**
     * Default constructor for an SecurityManager which passes default value to the class.
     * @custom.Postcondition:
     *    The object is created and contains the default message.
     */
	public InvalidLineCountException() {
		super(" Lines cannot be negative ");
	}

}
