package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * the first line cannot be removed.
 */
public class SingleLineRemovalException extends Exception{
	/**
     * Default constructor for an SecurityManager which passes default value to the class.
     * @custom.Postcondition:
     *    The object is created and contains the default message.
     */
	public SingleLineRemovalException() {
		super(" There is a single line ");
	}

}
