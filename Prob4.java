/*

http://www.codeabbey.com/index/task_view/min-of-two

Problem:
	Given a certain number of pairs, print the lesser value of each pair.
	
Thought-process:
	-Greeting
	-ask for number of pairs to be evaluated
	-create int array of number of pairs
		-minimum values will be stored here
	-for each pair ask for first number
	-then second number
	-compare the two numbers
	-store the smaller of the two numbers in the int array
	-print the array
	
*/



import java.util.*;

public class Prob4
{
	public static void main(String args[])
	{
	
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Welcome!\n" + "Given pairs of integers, I can tell you the smaller of the two numbers.\n");
		
		int numberOfPairs;
		
		System.out.println("How many pairs would you like for me to evaluate?");
		numberOfPairs = input.nextInt();
		
		int[] pairs = new int[numberOfPairs];

		int counter;
		int firstNumber;
		int secondNumber;
		
		
		
		for (counter = 1; counter <= numberOfPairs; counter++)
			{
			
			System.out.println("For pair #" + counter + ", what is the first number?");
			firstNumber = input.nextInt();
			System.out.println("What is the second number?");
			secondNumber = input.nextInt();
			
			if (firstNumber > secondNumber)
				{pairs[counter-1] = secondNumber;}
			else 
				{pairs[counter-1] = firstNumber;}
				
			}

		System.out.println("\nThe smaller numbers of the provided pairs are:");

		for (counter = 0; counter <= (numberOfPairs-1); counter++)
			{
			
			System.out.println("Pair #" + (counter+1) + ": " + pairs[counter]);
			
			}

		System.out.println("\n\n");



	} //main
} //class














































