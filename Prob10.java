/*

http://www.codeabbey.com/index/task_view/linear-function

Problem:
	Given two points, derive the linear function that runs through the two points.
	
	
Thought-process:
	-Greeting
	-ask how many linear functions they would like to derive
	-For each function, ask for the two points, and store them
	-evaluate
	-print linear function
	
	y = mx + b
	y - mx = b
	(firstY - (Slope * firstX)) == b

*/



import java.util.*;
import java.lang.Math;


public class Prob10
{

public static void main(String args[])
{


Scanner input = new Scanner(System.in);

System.out.println("\nGreetings!\nGiven coordinate pairs, I can derive their linear functions for you!\n");

int numberOfLinearFunctions;

System.out.println("How many linear functions would you like for me to derive?");
numberOfLinearFunctions = input.nextInt();

System.out.println("\n");

double[] firstX = new double[numberOfLinearFunctions]; 
double[] firstY = new double[numberOfLinearFunctions];
double[] secondX = new double[numberOfLinearFunctions];
double[] secondY = new double[numberOfLinearFunctions];

double[] slope = new double[numberOfLinearFunctions];
double[] intercept = new double[numberOfLinearFunctions];

int counter;

for (counter = 0; counter <= (numberOfLinearFunctions-1); counter++)
	{
	System.out.println("For linear function #" + (counter+1) + ":");
	
	System.out.println("What is the X coordinate of the first point?");
	firstX[counter] = input.nextDouble();
	
	System.out.println("What is the Y coordinate of the first point?");
	firstY[counter] = input.nextDouble();
	
	System.out.println("What is the X coordinate of the second point?");
	secondX[counter] = input.nextDouble();
	
	System.out.println("What is the Y coordinate of the second point?");
	secondY[counter] = input.nextDouble();
	
	System.out.println("\n");
	
	slope[counter] = ((secondY[counter] - firstY[counter]) / (secondX[counter] - firstX[counter]));
	intercept[counter] = (firstY[counter] - (slope[counter] * firstX[counter]));
	}

System.out.println("Awesome!\nHere are your derived linear functions!:\n");

for (counter = 0; counter <= (numberOfLinearFunctions-1); counter++)
	{
	
	System.out.println("For given pair of coordinates #" + (counter+1) + ":");
	System.out.println("Y = " + slope[counter] + "X + " + intercept[counter] + "\n");
	
	}


} //main

} //class























