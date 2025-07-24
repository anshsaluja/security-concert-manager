package src;

/**
 * An driver program used to test out the <CODE>SecurityCheck</CODE>
 * written as part of this assignment.  The user can use the commands below
 * to perform operations on <CODE>SecurityCheck</CODE> objects.
 * <dt><b>Commands:</b><dd>
 * 		(A) - Add Person
 *		(N) - Next Person
 *		(R) - Remove Person
 *		(L) - Add New Lines
 *		(P) - Print All Lines
 *		(Q) - Quit
 */
import java.util.*;
public class SecurityManager
{
	/**
     * Main function that calls the function based on the user's input.
     */
    public static void main(String[] args)throws TakenSeatException, AllLinesEmptyException, InvalidLineCountException, SingleLineRemovalException,LineDoesNotExistException
    {
        Scanner input = new Scanner(System.in);
        SecurityCheck newCheck = new SecurityCheck();

        boolean run = true;

        while(run)
        {
            System.out.println("(A) – Add Person\n" +
                    "(N) – Next Person\n" +
                    "(R) – Remove Lines\n" +
                    "(L) – Add Lines\n" +
                    "(P) – Print All Lines\n" +
                    "(Q) – Quit");

            System.out.print("Please enter an option: ");
            String option = input.nextLine();

            switch(option.toUpperCase())
            {
                case "A":
                    System.out.print("Enter a name: ");
                    String name = input.nextLine();
                    System.out.print("Enter a seat number: ");
                    int seatNumber = input.nextInt();
                    input.nextLine();
				newCheck.addPerson(name,seatNumber);//addperson

                    newCheck.showLineStatus();
                    System.out.println("Person added to line.\n");
                    break;

                case "N":
                	System.out.println("Loading...");
				newCheck.removeNextAttendee();//removes next attendee
				   newCheck.showLineStatus();
                	
                    break;

                case "R":

                    System.out.print("Enter the number of lines to be removed: ");
                    int number = input.nextInt();
                    input.nextLine();
                    int[] r = new int[number];

                    System.out.print("Enter the line numbers to be removed: ");
                    for(int i=0 ; i<number ; i++)
                    {
                        r[i] = input.nextInt();
                        input.nextLine();
                    }
				newCheck.removeLines(r);
				

				newCheck.showLineStatus();
				System.out.println();
                    break;

                case "L":
                    System.out.print("Enter the number of lines to be added: ");
                    int lines = input.nextInt();
                    input.nextLine();
				newCheck.addNewLines(lines);
                    newCheck.showLineStatus();
                    System.out.println();
                    break;

                case "P":
                	newCheck.print();//prints the people in the line

                    break;

                case "Q":
                    System.out.print("Program terminating normally..");
                    run = false;//quits the code
                    break;
                default:
                	continue;
            }
        }
    }

}
