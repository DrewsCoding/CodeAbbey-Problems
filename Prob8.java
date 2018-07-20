/*

http://www.codeabbey.com/index/task_view/arithmetic-progression

Problem:
	Arithmetic Progression.  Ask for an initial number, the increment, and the number of
		increments to perform, and then total them up.  Do for an input number of cases.
Example:
	A + (A + B) + (A + 2B) + ... + (A + (N - 1)B)

Thought-process:
	-Greeting
	-Ask how many progressions they would like totaled
	-for loop for that many progressions
	-for each progression, ask for:
		-Starting number
		-Increment
		-number of increments to perform
	-total up the progressions

*/



import java.lang.Math;
import java.util.*;


public class Prob8
{

public static void main(String args[])
{



Scanner input = new Scanner(System.in);

	System.out.println("Greetings!\nI can sum arithmetic progressions for you!");

int numberOfProgressions;

	System.out.println("How many progressions would you like for me to sum?");
	numberOfProgressions = input.nextInt();
	
	System.out.println("Okay! I will need you to provide me with some variables!");

	int[] answers = new int[numberOfProgressions];

	int A;						//starting number
	int B;						//increment
	int N;						//number of increments

	int[] As = new int[numberOfProgressions];
	int[] Bs = new int[numberOfProgressions];
	int[] Ns = new int[numberOfProgressions];
	
	int counter;
	int counter2;
	int math;
	int sum = 0;

	if (numberOfProgressions == 1)
		{
		System.out.println("What is the starting number?");
		A = input.nextInt();
		
		System.out.println("What is the increment amount?");
		B = input.nextInt();
		
		System.out.println("How many increments would you like for me to sum?");
		N = input.nextInt();
		
		for (counter = 0; counter <= N-1; counter++)
			{
			math = A + (counter * B);
			sum += math;
			}
		
		System.out.println("Your total sum of the progression is:");
		System.out.println(sum);
		}
	else
		{
		for (counter2 = 0; counter2 <= (numberOfProgressions-1); counter2++)
			{
			
			System.out.println("For progressions #" + (counter2 + 1) + ":");
			
			System.out.println("What is the starting number?");
			As[counter2] = input.nextInt();
		
			System.out.println("What is the increment amount?");
			Bs[counter2] = input.nextInt();
		
			System.out.println("How many increments would you like for me to sum?");
			Ns[counter2] = input.nextInt();
			
			math = 0;
			
			for (counter = 0; counter <= (Ns[counter2]-1); counter++)
				{
				math = As[counter2] + (counter * Bs[counter2]);
				answers[counter2] += math;
				}
			}
			
		System.out.println("\n\nI have your solutions!\n");
			
		for (counter2 = 0; counter2 <= (numberOfProgressions-1); counter2++)
			{
			System.out.println("Sum for progression #" + (counter2 + 1) + ":");
			System.out.println(answers[counter2]);
			}
		
		System.out.println("\n");
			
		}




} //main

} //class

























