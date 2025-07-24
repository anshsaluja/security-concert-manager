package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * lines entered to remove does not exist.
 * @author 
 * 		Ansh Saluja, SBU ID #: 115184358
 * <dt><b>Assignment:</b><dd>
 *    Homework #2 for CSE 214, Spring 2023
 * <dt><b>Date:</b><dd>
 *    March 31st, 2023
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
