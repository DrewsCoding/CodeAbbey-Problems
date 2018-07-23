/*

http://www.codeabbey.com/index/task_view/average-of-array

Problem:
	Given sets of numbers, calculate the average for each.
	
	
Thought-process:
	-ask for number of number sets to be evaluated
	-results array
	-for loop for each number set
	-Ask for number set, space-separated
	-store number set in string
	-split string by spaces, storing each number in an array
	-for loop to Double.parseDouble(array[counter])
	-for loop that adds the next number in the set to a total variable
	-divide total variable by array.length
	-set answer to results array
	-set the number array to null
	-for loop to print results array



*/



import java.util.*;


public class Prob16
{

public static void main(String args[])
{

	
	Scanner input = new Scanner(System.in);
	
	System.out.println("\n\nAverage Calculator\n__________________\n\n");
	System.out.println("Instructions:  Provide number sets with each number separated by a space.\n\n");

	int numberOfSets;

	System.out.println("How many number sets would you like evaluated?");
	numberOfSets = input.nextInt();
	
	System.out.print("\n");
	
	int counter;
	int counter2;
	String[] numberSets = new String[numberOfSets];
	
	
	for (counter = 0; counter <= (numberOfSets-1); counter++)		//get the number sets
		{
		if (numberOfSets == 1)
			{
			System.out.println("Provide number set now:");
			}
		else
			{System.out.println("Provide number set #" + (counter+1) + ":");}
			
		numberSets[counter] = input.nextLine();
		if (counter == 0)
			{numberSets[counter] = input.nextLine();}	
			
		System.out.print("\n");
		}	


	double sum;
	double[] averages = new double[numberOfSets];
	

	for (counter = 0; counter <= (numberOfSets-1); counter++)	//convert string number set to double array
		{
		
		String[] numbers = numberSets[counter].split(" ");
		
		double[] numbersDouble = new double[numbers.length];
		
		
		for (counter2 = 0; counter2 <= (numbersDouble.length-1); counter2++)
			{
			numbersDouble[counter2] = Double.parseDouble(numbers[counter2]);
			}
			
		sum = 0;	
		
		for (counter2 = 0; counter2 <= (numbersDouble.length-1); counter2++)
			{
			sum += numbersDouble[counter2];
			}
		
		averages[counter] = (sum / numbersDouble.length);
		
		}


	System.out.println("\n\nResults\n_______\n");
	
	for (counter = 0; counter <= (numberOfSets-1); counter++)
		{
		System.out.println("	Set #" + (counter+1) + ":  " + averages[counter]);
		}

	System.out.print("\n\n\n");



} //main

} //class