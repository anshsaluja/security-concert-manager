package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * lines entered to remove does not exist.
 */
public class LineDoesNotExistException extends Exception {
	/**
     * Default constructor for an SecurityManager which passes default value to the class.
     * @custom.Postcondition:
     *    The object is created and contains the default message.
     */
    public LineDoesNotExistException() {
    	super(" Line does not exist ");
    }
}
