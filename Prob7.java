/*

http://www.codeabbey.com/index/task_view/fahrenheit-celsius

Problem:
	Convert Fahrenheit to Celsius.  Ask for how many temps they want converted, then
		convert them and print.
		
Thought-process:
	-Greetings
	-Ask how many temps they would like converted
	-Ask for each temp and store it in an array of size number of temps
	-print temps
	
	Note: To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 
		and multiply by .5556 (or 5/9).

*/


import java.lang.Math;
import java.util.*;



public class Prob7
{

public static void main(String args[])
{

	Scanner input = new Scanner(System.in);

	System.out.println("Greetings!\nI can convert Fahrenheit to Celsius for you!");
	
	int numberOfTemps;
	
	System.out.println("How many temperatures would you like for me to convert?");
	numberOfTemps = input.nextInt();
	
	int[] converted = new int[numberOfTemps];
	
	int counter;
	double unconverted;
	
	System.out.println("\nOf the " + numberOfTemps + " temperatures that you would like converted,");
	for (counter = 1; counter <= numberOfTemps; counter++)
		{
		System.out.println("what is #" + counter + "?");
		unconverted = input.nextDouble();
		
		converted[counter-1] = (int) Math.round((unconverted - 32)*0.5556);
		}
	
	System.out.println("\nYour temperatures converted into Celsius are as follows:");

	for (counter = 1; counter <= numberOfTemps; counter++)
		{
		System.out.println("#" + counter + ": " + converted[counter-1]);
		}

	System.out.print("\n");

} //main
} //class






















