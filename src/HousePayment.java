/**
 * This program finds calculates your average spent over the span of "n" number of months
 * 
 * HousePayment
 * 
 * @author Landon Walls
 *
 */
import java.util.Scanner;
public class HousePayment {

	public static void main(String[] args) {
		double monthSalary;
		int numMonths;
		double monthlyBill[][];
		double total;
		double monthlyAverage;
		double averageLeftOver;
		//Enter monthly salary
		monthSalary = validateInDouble(0, "Monthly Salary: ");
		//num months
		numMonths = validateIn(0, 12, "Number of Months: ");
		//create an array for each month
		//num bills for month
		monthlyBill = arrayBills(numMonths);
		// Output how much money spent
		System.out.println();
		printArray(monthlyBill);
		// Find average money spent a month 
		System.out.println();
		total = sum(monthlyBill);
		System.out.println();
		System.out.printf("You spent a total of       $ %,.2f" , total);
		monthlyAverage = total / numMonths;
		System.out.println();
		System.out.printf("You spent an average of    $ %,.2f", monthlyAverage);
		// Output results of how much money left from paycheck
		System.out.println();
		averageLeftOver = (monthSalary - monthlyAverage);
		System.out.printf("On average you would have  $ %,.2f left each month", averageLeftOver);

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

			if (num <= LowerBound)
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
	/**
	 * This method creates an 2d array of bills
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param numArrays, number of elements the array holds
	 * @return arrayBills, array to hold movie names
	 */
	public static double[][] arrayBills(int numArrays)
	{
		int numMonths = numArrays;
		int numBills = 0;
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
	 * This method prints a 2d array of bills
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param array, array of values
	 */
	public static void printArray(double[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Month ");
			System.out.printf("%d:",(i + 1));
			for(int j = 0; j < array.length; j++)
			{
				double price = array[i][j];
				System.out.printf("%10.2f", price);
			}
			System.out.println();
		}
	}
	/**
	 * This method finds the average of a 2d array of bills
	 * Developed 11/17/2022
	 * Modified 11/17/2022
	 * @author Landon Walls 
	 * @param array, array of values
	 */
	 public static double sum(double[][] array) 
	 {
		    double total = 0;
		    for (int i = 0; i < array.length; i++) 
		    {
		        for (int k = 0; k < array[i].length; k++) 
		        {
		            total = total + array[i][k];
		        }
		    }
		    return total;
	 }
}
