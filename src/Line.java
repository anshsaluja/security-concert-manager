package src;

/**
 * An abstract data type meant to serve as a representation of a 
 * Line, containing the headPerson, tailPerson, length, lineLink and methods to manipulate these values. 
 * 
 * @author 
 * 		Ansh Saluja, SBU ID #: 115184358
 * <dt><b>Assignment:</b><dd>
 *    Homework #2 for CSE 214, Spring 2023
 * <dt><b>Date:</b><dd>
 *   March 31st, 2023
 */

	public class Line
	{
	    private Person headPerson;//headPerson of the Line
	    private Person tailPerson;//tailPerson of the Line
	    private int length;//length of the line
	    private Line lineLink;//link to the next line
	    private static int serialCounter = -3;//count serial ID
	    private int serialId;//name the lines
	    /**
	     * No-Arg constructor
	     * @custom.Postcondtion
	     *      This object has been initialized to a default headPerson,tailPerson,lineLink.
	     */
	    public Line()
	    {
	        serialCounter++;
	        serialId = serialCounter;
	    }
	    /**
	     * Public getter method for the link of the next Line.
	     * @return
	     *      The nextLine.
	     */
	    public Line getLineLink()
	    { return lineLink; }
	    /**
	     * Public getter method for serialID.
	     * @return
	     *      The serialID.
	     */
	    public int getSerialId()
	    { return serialId; }
	    /**
	     * Public setter method for serialID.
	     * @param s
	     *      The number to set the new ID.
	     * @custom.Precondition
	     *      The new ID to set the serialID.
	     */
	    public void setSerialId(int s)
	    {
	        serialId = s;
	    }
	    /**
	     * repairs the serialID and decreases the counter by making implementation easier.
	     */
	    public void repairSerialId()
	    {
	        serialCounter--;//decreases the SerialID
	    }
	    /**
	     * Public setter method for nextLine.
	     * @param lineLink
	     *      The newLink for the nextLine.
	     * @custom.Precondition
	     *      The newLink for the nextLine.
	     */
	    public void setLineLink(Line newLink)
	    { this.lineLink = newLink;}
	    /**
	     * Public getter method for the length of the Line.
	     * @return
	     *      The length of the Line.
	     */
	    public int getLength()
	    { return length; }
	    /**
	     * adds the person to the Line by managing the headPerson, tailPerson and length and checking the seatNumber. 
		 * @param attendee
		 * 		Person to be added in the line
	     */
	    public Person getTailPerson()
	    {
	    	return tailPerson;
	    }
	    public void addPerson(Person attendee)
	    {
	    	if(headPerson==null)//checks if there are person in the line and sets the headPerson, tailPerson accordingly
	        {
	            headPerson=attendee;
	            tailPerson=attendee;
	        }
	        else if(length==1)//check if there is a single person and sets the headPerson, tailPerson accordingly
	        {
	            if(headPerson.getSeatNumber()>attendee.getSeatNumber())
	            {
	                attendee.setNextPerson(headPerson);
	                headPerson=attendee;
	                tailPerson=headPerson.getNextPerson();
	            }
	            else
	            {
	                headPerson.setNextPerson(attendee);
	                tailPerson=attendee;
	            }
	        }
	        else//adds the person by managing the headPerson, tailPerson and length.
	        {
	            Person p = headPerson;
	            if(p.getSeatNumber()>attendee.getSeatNumber())
	            {
	                attendee.setNextPerson(p);
	                headPerson=attendee;
	            }
	            else
	            {
	                Person pfront = headPerson.getNextPerson();
	                while(pfront!=null)//while loop to find the seatNumber after which the person shall be added and adds the person there
	                {
	                    if(pfront.getSeatNumber()>attendee.getSeatNumber())
	                    {
	                        attendee.setNextPerson(pfront);
	                        p.setNextPerson(attendee);
	                        break;
	                    }
	                    else
	                    {
	                        if(pfront==getTailPerson())
	                        {
	                            pfront.setNextPerson(attendee);
	                            tailPerson=attendee;
	                            break;
	                        }
	                        p=p.getNextPerson();
	                        pfront=pfront.getNextPerson();
	                    }
	                }
	            }
	        }
	        length++;//increases the length after person is added
	    }
	    /**
	     * Returns the first Front Person in the Line which is removed
	     * @return
	     *      The Person from the Line to be removed.
	     */
	    public Person removeFrontPerson()
	    {
	        if(length != 0)
	        {
	            Person removed = headPerson;

	            if(length == 1)
	            {
	                headPerson = null;
	                tailPerson = null;
	            }
	            else
	            {
	                headPerson = headPerson.getNextPerson();
	            }
	            length--;
	            return removed;
	        }
	        return null;
	    }
	    /**
	     * Returns the String representation of the line
	     * @return
	     *      The string of the line.
	     */
	    public String toString()
	    {
	        String line = "";
	        Person tempPerson = headPerson;

	        for(int i = 0 ; i < length ; i++)
	        {
	            line += tempPerson.toString();
	            line += "\n";
	            tempPerson = tempPerson.getNextPerson();
	        }

	        return line;
	    }
	    public Person getHeadPerson()
	    {
	    	return headPerson;
	    }
	}
	


