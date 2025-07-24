package src;

/**
 * An abstract data type meant to serve as a representation of a 
 * Person, containing the name, seatNumber and nextPerson and methods to manipulate these values. 
 * 
 * @author 
 * 		Ansh Saluja, SBU ID #: 115184258
 * <dt><b>Assignment:</b><dd>
 *    Homework #2 for CSE 214, Spring 2023
 * 		Recitation #: R07
 * <dt><b>Date:</b><dd>
 *   March 31st, 2023
 */
public class Person{
    private String name;//name of the person
    private int seatNumber;//seatNumber of the person
    private Person nextPerson;//nextPerson
    /**
     * No-Arg constructor
     * @custom.Postcondtion
     *      This object has been initialized to a default Person.
     */
    public Person()
    {}
    /**
     * Default constructor
     * @custom.Postcondtion
     *      This object has been initialized to a Person with a given name and seatNumber.
     */
    public Person(String name, int seatNumber)
    {
        if(name == null || seatNumber < 0)
        {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.seatNumber = seatNumber;
    }
    /**
     * Public getter method for the name member variable.
     * @return
     *      The name of the Person.
     */
    public String getName()
    { return name; }
    /**
     * Public getter method for the seatNumber of the member variable.
     * @return
     *      The seatNumber of the Person.
     */
    public int getSeatNumber()
    { return seatNumber; }
    /**
     * Public getter method for the nextPerson of the line.
     * @return
     *      The nextPerson of the Line.
     */
    public Person getNextPerson()
    { return nextPerson; }
    /**
     * Public setter method for the name member variable.
     * @param name
     *      The new name of this person. This parameter should have any digit or shall not be empty
     * @custom.Precondition
     *      The new name of the person. This parameter should not have any digits or shall not be empty
     * @throws IllegalArgumentException
     * 		Thrown if name is null or has any digits.
     */
    public void setName(String name)
    {
        if(name == null)
        {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }
    /**
     * Public setter method for the seatNumber member variable.
     * @param seatNumber
     *      The new seatNumber of this person. This parameter should have any digit or shall not be empty
     * @custom.Precondition
     *      The new seatNumber of the person. This parameter should not have any digits less than 0
     * @throws IllegalArgumentException
     * 		Thrown if seatNumber is less than 0.
     */
    public void setSeatNumber(int seatNumber)
    {
        if(seatNumber < 0)
        {
            throw new IllegalArgumentException();
        }

        this.seatNumber = seatNumber;
    }
    /**
     * Public setter method for the nextPerson in the Line.
     * @param nextPerson
     *      The new Person to be added in the line.
     * @custom.Precondition
     *      The new Person in the line.
     */
    public void setNextPerson(Person p)
    {
        if(p == null)
        {
            throw new IllegalArgumentException();
        }

        nextPerson = p;
    }

//    public String toString()
//    {
//        String person = "";
//        person += name;
//        person += "   |   " + seatNumber;
//        return person;
//    }
}
