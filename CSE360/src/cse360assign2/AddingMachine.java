package cse360assign2;

public class AddingMachine 
{
	
	private int total;
	String operations = "0";
	
	/**
	 * Main Method to test if program works
	 * currently commented out
	 * 
	 */
	
	public static void main(String[]args)
	{
		AddingMachine mc = new AddingMachine();
		int temp;
		mc.add(14);
		mc.subtract(2);
		mc.subtract(2);
		mc.subtract(2);
		temp = mc.getTotal();
		System.out.println(temp);
		mc.subtract(5);
		System.out.println(mc.getTotal());
		mc.clear();
		System.out.println(mc.getTotal());
		
	}
	
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
