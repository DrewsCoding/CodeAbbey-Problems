/*

http://www.codeabbey.com/index/task_view/sums-in-loop

Problem:  Summing pairs.  Ask how many pairs they would like to sum and then ask for the 
pairs to be summed.  Then print the pairs together.

Thought process:
	-introduction of program to user
	-ask how many pairs to sum
	-create sum variable for each of the pairs
	-ask for first number from pair one
	-ask for second number from pair one
	-etc.
	-print all together

*/




import java.util.*;

public class Prob3
{
	
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	
	System.out.println("\n\n" + "Welcome!");
	System.out.println("I can sum pairs for you!" + "\n");
	
	int numberOfPairs;
	
	System.out.println("How many pairs would you like me to sum?");
	numberOfPairs = input.nextInt();
	
	System.out.println("\n" + "Sounds good!");
	
	int[] pairs = new int[numberOfPairs];
	
	int counter;
	int firstNumber;
	int secondNumber;
	
	for (counter = 0; counter <= (numberOfPairs-1); counter++)
		{
		System.out.println("\n\n" + "For pair #" + (counter+1) + ", what is the first number?");
		firstNumber = input.nextInt();
		
		System.out.println("Okay." + "\n" + "What is the second number?");
		secondNumber = input.nextInt();
		
		System.out.print("\n\n");
		
		pairs[counter] = firstNumber + secondNumber;
		}
	
	System.out.println("\n\n" + "The sums of your " + numberOfPairs + " pairs are:" + "\n");
	
	for (counter = 0; counter <= (numberOfPairs-1); counter++)
		{
		System.out.print(pairs[counter] + " ");
		}
	
	System.out.println("\n\n");
//	System.exit(0);

	
}  //main
}  //class