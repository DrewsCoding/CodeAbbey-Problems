/*

http://www.codeabbey.com/index/task_view/rounding

Problem:
	Given a provided number of pairs, divide the first numbers by the second numbers,
		and print a rounded off whole number.
		
Thought-process:
	-Greeting
	-Ask for number of pairs to be provided
	-create int array to store the rounded values
	-ask for first number as double
	-ask for second number as double
	-divide first by second
	-round the answer with Math.round(number)
	-cast rounded number to int
	-store rounded number in int array 
	-print int array

*/


import java.lang.Math;
import java.util.*;


public class Prob6
{

public static void main(String args[])
{

	Scanner input = new Scanner(System.in);

	System.out.print("\nGreetings!\n" + "Given sets of pairs, I can divide the first ");
	System.out.println("number by the second number and give you the rounded-off answers!" + "\n");

	int numberOfPairs;

	System.out.println("How many pairs would you like for me to divide for you?");
	numberOfPairs = input.nextInt();
	
	int[] answers = new int[numberOfPairs];

	int counter;
	double firstNumber;
	double secondNumber;
	double answer;

	for (counter = 1; counter <= numberOfPairs; counter++)
		{
		System.out.println("For pair #" + counter + ", what is the first number?");
		firstNumber = input.nextDouble();
		
		System.out.println("What is the second number?");
		secondNumber = input.nextDouble();
		
		answer = (firstNumber/secondNumber);
		answers[counter-1] = (int) Math.round(answer);
		}

	System.out.println("\nYour Answers are:");
	for (counter = 1; counter <= numberOfPairs; counter++)
		{
		System.out.println("Pair #" + counter + ":");
		System.out.println(answers[counter-1]);
		}

	System.out.println("\n");


}  //main
}  //class




























