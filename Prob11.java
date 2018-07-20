/*

http://www.codeabbey.com/index/task_view/sum-of-digits

Problem:
	Sum of digits.  User will input how many sums of digits they would like calculated, and then 
		for each sum, provide 3 numbers.  The first will be multiplied by the second, and
		then the third will be added to that sum.  This final number will be used to find
		the sum of its digits.
		
Thought-process:
	-Greetings
	-create and ask for the 3 number variables
	-complete math with 3 provided numbers
	-store total in new variable
	-continually modula and divide by 10 until new variable is >= 1
	-add modula remainders together for each division.
	-print digit sums
	
*/




import java.util.*;


public class Prob11
{

public static void main(String args[])
{


System.out.print("\nGreetings!\nGiven three numbers, I will multiply the first two ");
System.out.print("together, add the third, and then sum up the individual digits of the ");
System.out.println("solution!  I will then let you know the sum of the digits.");

Scanner input = new Scanner(System.in);

int numberOfSums;

System.out.println("How many sums of digits would you like for me to calculate?");
numberOfSums = input.nextInt();

System.out.println("\nSounds good!\n");

int[] a = new int[numberOfSums];
int[] b = new int[numberOfSums];
int[] c = new int[numberOfSums];

int counter;

int[] numForDigits = new int[numberOfSums];
int remainder;
int[] sumOfDigits = new int[numberOfSums];

for (counter = 0; counter <= (numberOfSums-1); counter++)
	{
	
	System.out.println("For sum #" + (counter+1) + ":");
	
	System.out.println("What is the first number?");
	a[counter] = input.nextInt();
	
	System.out.println("What is the second number?");
	b[counter] = input.nextInt();
	
	System.out.println("What is the third number?");
	c[counter] = input.nextInt();
	
	System.out.print("\n");
	
	numForDigits[counter] = ((a[counter] * b[counter]) + c[counter]);
	
	remainder = 0;
	
	while (numForDigits[counter] >= 1)
		{
		
		remainder = numForDigits[counter] % 10;
		
		sumOfDigits[counter] += remainder;
		
		numForDigits[counter] = (numForDigits[counter] / 10);
		
		}
	
	}

if (numberOfSums == 1)
	{System.out.println("Given your inputs, I have the solution!\n");}
else 
	{System.out.println("Given your inputs, I have the solutions!\n");}

for (counter = 0; counter <= (numberOfSums-1); counter++)
	{
	
	System.out.print("The sum of digits for " + a[counter] + " * " + b[counter]);
	System.out.print(" + " + c[counter] + " is:\n");
	System.out.println(sumOfDigits[counter] + "\n");
	}




















} //main

} //class