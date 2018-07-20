/*


http://www.codeabbey.com/index/task_view/sum-in-loop

Challenge:  

	Sum a given number of integers together with a loop, with both the number of integers
		and each individual integer being input.




Pre-coding thought process:

	ask user how many integers they would like to sum

	for loop that loops that number of times, asking for an another input integer, until you
	have them all, then sums the integers 
	-ask: of the x integers to be summed, enter integer #y
	-use another loop to continue adding the inputs one by one to a totalSum variable
*/



import java.util.*;

public class Prob2
{
	public static void main(String args[])
	{
	
		int numberOfInputs = 0;
		int counter;
		int nextInteger = 0;
		int totalSum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Integers would you like to sum?");
		numberOfInputs = input.nextInt();
			System.out.print("\n" + "Okay." + "\n\n");
		
		
		for (counter = 1; counter <= numberOfInputs; counter++)
			{
			System.out.println("Of the " + numberOfInputs + " integers to be summed, enter integer #" + counter +":");
			nextInteger = input.nextInt();
			totalSum += nextInteger;
			System.out.print("\n");
			}
		
		System.out.println("The sum of those integers, together, is: " + totalSum);
		
	
	}	//main
}	//class