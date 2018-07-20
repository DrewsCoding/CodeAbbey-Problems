/*

http://www.codeabbey.com/index/task_view/min-of-three

Problem:
	Given a certain number of sets of 3 numbers, print the smallest number of each set.
	
Thought-process:
	-Greeting
	-Ask for number of sets of 3
	-create array of number of sets, to store the smallest of each set
	-For each number of sets, ask for first number
	-then second
	-then third
	-evaluate the three numbers against each other with conditionals
	-store the smallest in array
	-print the array

*/




import java.util.*;

public class Prob5
{

public static void main(String args[])
{

	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Greetings!\n" + "Given sets of three numbers, I can tell you the smallest of each set!\n");
	
	int numberOfSets;
	
	System.out.println("How many sets of three would you like for me to evaluate?");
	numberOfSets = input.nextInt();
	
	int[] sets = new int[numberOfSets];
	
	int counter;
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	
	for (counter = 1; counter <= numberOfSets; counter++)
		{
		
		System.out.println("For set #" + counter + ", what is the first number?");
		firstNumber = input.nextInt();
		
		System.out.println("What is the second number?");
		secondNumber = input.nextInt();
		
		System.out.println("What is the third number?");
		thirdNumber = input.nextInt();
		
		if (firstNumber < secondNumber)
			{
				if (firstNumber < thirdNumber)
					{
						sets[counter-1] = firstNumber;
					}
			} 
		else 
			{
				if (secondNumber < thirdNumber)
					{
						sets[counter-1] = secondNumber;
					}
				else
					{
						sets[counter-1] = thirdNumber;
					}
			}
			
		} //for loop
	
	System.out.println("The smallest numbers from your provided sets are:");
	for (counter = 1; counter <= numberOfSets; counter++)
		{
		System.out.println("Set #" + counter +": " + sets[counter-1]);
		}	
	



} //main
} //class




































