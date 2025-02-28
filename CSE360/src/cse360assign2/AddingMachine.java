/**
 * Class: CSE 360 ASU ID: 1212977790 Author: Kobe Goldman
 * 
 * (This program is a simple object oriented calculator with various 
 *  methods for performing operations.)
 *	
 *	GitHub Repository Link: https://github.com/daalegend27/CSE360Assign2
 * 
 *
 * @author (Kobe Goldman)
 */


package cse360assign2;

public class AddingMachine 
{
	
	private int total;
	String operations = "0";
	
	/**
	 * Method to 
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return integer variable total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * takes input parameter value and returns the arithmetic operation
	 * total+=value
	 * additionally, updates operations with the operation performed. 
	 * @param value 
	 */
	public void add (int value) 
	{
		total += value;
	    String tempValue = Integer.toString(value);
		operations = operations + " + " + tempValue; 
	}
	
	/**
	 * takes input parameter value and returns the arithmetic operation
	 * total+-value
	 * additionally, updates operations with the operation performed. 
	 * @param value 
	 */
	public void subtract (int value) 
	{
		total-= value;
		String tempValue = Integer.toString(value);
		operations = operations + " - " + tempValue; 
		
	}
		
	/**
	 * method to return the string operations which holds the arithmetic
	 * operations on the integer total. 
	 * @return operations
	 */
	public String toString () 
	{
		return operations;
	}

	/**
	 * Method for cleaning variables. 
	 */
	public void clear() 
	{
		total = 0; 
		operations = "0";
	
	}
}
