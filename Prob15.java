/*

http://www.codeabbey.com/index/task_view/maximum-of-array

Problem:
	Given a set of numbers, print the maximum and minimum values from the set.
	
	
Thought process:
	-if all numbers are presented at once, space-separated:
		-use string#.split(" "); to place each individual value into an array
		-place first value into a maximum variable, and a minimum variable
		-for loop through the array using array#.size
		-if the next value is larger, put it in max
		-if next value is smaller, put it in min
		-print min and max
		
	-was going to have individually input numbers as well, but that would be much less
		efficient for the user.

*/




import java.util.*;



public class Prob15
{

public static void main(String args[])
{


	Scanner input = new Scanner(System.in);
	
	
	System.out.println("\n\n\nMaximum and Minimum\n___________________\n\n");
	System.out.print("Instructions:  Given a set of numbers, I will tell you the ");
	System.out.print("maximum and minimum values.  Provide as many numbers as you ");
	System.out.println("would like, individually separated by a SPACE.\n");

	String numberSet;

	System.out.println("Provide your number set now:");
	numberSet = input.nextLine();

	String[] number = numberSet.split(" ");
	double[] numberDouble = new double[number.length];
	
	int counter;
	
	for (counter = 0; counter <= (number.length-1); counter++)
		{
		
		numberDouble[counter] = Double.parseDouble(number[counter]);
		
		}
	
	double maximum = numberDouble[0];
	double minimum = numberDouble[0];
	
	for(counter = 1; counter <= (numberDouble.length-1); counter++)
		{
		if (numberDouble[counter] > maximum)
			{
			maximum = numberDouble[counter];
			}
		
		if (numberDouble[counter] < minimum)
			{
			minimum = numberDouble[counter];
			}	
		}

	System.out.println("\n\nResults:\n________\n");
	System.out.println("	Maximum:  " + maximum);
	System.out.println("	Minimum:  " + minimum + "\n\n");


} //main

} //class



