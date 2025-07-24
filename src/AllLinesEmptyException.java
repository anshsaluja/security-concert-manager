package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * All Lines are empty and no line can be removed.
 * @author 
 * 		Ansh Saluja, SBU ID #: 115184358
 * <dt><b>Assignment:</b><dd>
 *    Homework #2 for CSE 214, Spring 2023
 * <dt><b>Date:</b><dd>
 *    March 31st, 2023
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
