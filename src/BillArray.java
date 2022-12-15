import java.util.Scanner;

public class BillArray {
	private int numBills = 0;
	
	/**
	 * This method creates an 2d array of bills
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param numArrays, number of elements the array holds
	 * @return arrayBills, array to hold movie names
	 */
	public double[][] arrayBills(int numArrays)
	{
		int numMonths = numArrays;
		double arrays[][] = new double[numArrays][1000];  
		int i = 0;
		int j = 0;
		// new row
		for (i = 0; i < arrays.length; i++)
		{
			System.out.println("Month " + (i+1) + ": ");
			numBills = validateIn(0, 1000, "Number of bills this month: ");
			// new column
		  for (j = 0; j < numBills; j++)
		  {
			  double bill = validateInDouble(0, "Enter bill price " + (j+1) + ": ");
			  arrays[i][j] = bill;
		  }
		}
		return arrays;
	}
	/**
	 * This method returns the number of bills
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param numArrays, number of elements the array holds
	 * @return arrayBills, array to hold movie names
	 */
	public int getNumBills()
	{
		return numBills;
	}
	/**
	 * This method validates user input
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param LowerBound, lower bound of input validation 
	 * @param prompt, the prompt asking the user for a value
	 * @retrun num, the number after passing input validation
	 */
	public static int validateIn(int LowerBound, int UpperBound, String prompt) {
		
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean hasGoodNumber = false;
		while (!hasGoodNumber)
		{
			System.out.println(prompt);
			
			while (!in.hasNextInt())
			{
				System.out.println("Value must be a number greater than " + LowerBound + " and lower than " + UpperBound);
				System.out.println();
				in.nextLine();
				System.out.println(prompt);
			}
			num = in.nextInt();

			if (num < LowerBound || num > UpperBound)
			{
				System.out.println("Value must be a number greater than " + LowerBound + " and lower than " + UpperBound);
				System.out.println();
			}
			else
			{
				hasGoodNumber = true;
			}
		}
		return num;
 }
public static double validateInDouble(double LowerBound, String prompt) {
		
		Scanner in = new Scanner(System.in);
		double num = 0;
		boolean hasGoodNumber = false;
		while (!hasGoodNumber)
		{
			System.out.print(prompt);
			
			while (!in.hasNextDouble())
			{
				System.out.println("Value must be a number greater than " + LowerBound);
				System.out.println();
				in.nextLine();
				System.out.println(prompt);
			}
			num = in.nextDouble();

			if (num < LowerBound)
			{
				System.out.println("Value must be a number greater than " + LowerBound);
				System.out.println();
			}
			else
			{
				hasGoodNumber = true;
			}
		}
		return num;
 }
}
