package src;

/**
 * An exception thrown in the <CODE>SecurityManager</CODE> class to indicate that 
 * the seat is already taken by the people in concert.
 * @author 
 * 		Ansh Saluja, SBU ID #: 115184358
 * <dt><b>Assignment:</b><dd>
 *    Homework #2 for CSE 214, Spring 2023
 * 		Recitation #: R07
 * <dt><b>Date:</b><dd>
 *    March 31st, 2023
 */
public class TakenSeatException extends Exception {
	/**
     * Default constructor for an SecurityManager which passes default value to the class.
     * @custom.Postcondition:
     *    The object is created and contains the default message.
     */
      public TakenSeatException() {
    	  super(" Seat is already taken ");
      }
}
