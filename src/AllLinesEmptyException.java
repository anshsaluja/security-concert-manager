package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * All Lines are empty and no line can be removed.
 */
public class AllLinesEmptyException extends Exception {
	/**
     * Default constructor for an SecurityManager which passes default value to the class.
     * @custom.Postcondition:
     *    The object is created and contains the default message.
     */
  public AllLinesEmptyException() {
	  super(" Lines are Empty ");
  }
}
