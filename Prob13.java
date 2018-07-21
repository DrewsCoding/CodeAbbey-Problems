/*

http://www.codeabbey.com/index/task_view/weighted-sum-of-digits

Problem:
	Given a number, separate it into its individual digits, and then sum each digit, in
		an increasingly weighted way, such that:
		
		1776 = 1 * 1 + 7 * 2 + 7 * 3 + 6 * 4 
			 = 60

thought-process:
	-greeting
	-store numbers to be evaluated
	-for loop for each desired number to be evaluated
		-create ArrayList to store digits
		-while loop
			-add digit to ArrayList using modula 10
			-then divide by 10 to remove the last digit from the number
		-for loop
			-gets the digits
			-multiplies them by the weight for that digit
			- += this to a weightedSum variable
		-*arraylistname*.clear();
	-for loop
		-prints the results

*/




import java.util.*;




public class Prob13
{

public static void main(String args[])
{



Scanner input = new Scanner(System.in);


System.out.println("Greetings!\nI am a weighted sum of digits bot!");
System.out.print("Given an integer, I can sum the digits of that integer, in an ");
System.out.println("increasingly weighted fashion, from first digit to last.\n");


int numberOfIntegers;


System.out.println("How many integers would you like for me to evaluate?");
numberOfIntegers = input.nextInt();

int[] providedIntegers = new int[numberOfIntegers];
int[] weightedSums = new int[numberOfIntegers];
int counter;
int counter2;
int digit;
ArrayList<Integer> digits = new ArrayList<>();


for (counter = 0; counter <= (numberOfIntegers-1); counter++)
	{
	
	if (numberOfIntegers == 1)
		{
		System.out.println("What is the integer that you would like evaluated?");
		providedIntegers[counter] = input.nextInt();
		}
	else
		{
		System.out.println("What is integer #" + (counter+1) + "?");
		providedIntegers[counter] = input.nextInt();
		}
		
	while (providedIntegers[counter] >= 1)
		{
		digits.add(providedIntegers[counter] % 10);
		providedIntegers[counter] = (providedIntegers[counter] / 10);
		}
	
	Collections.reverse(digits);
	
	for (int i = 0; i < digits.size(); i++)
		{
		digit = digits.get(i);
		weightedSums[counter] += (digit * (i+1));
		}
		
	digits.clear();
	
	System.out.print("\n");
	
	}



if (numberOfIntegers == 1)
	{
	System.out.println("The weighted sum of digits for your integer is:");
	System.out.println(weightedSums[0]);
	}
else
	{
	for (counter = 0; counter <= (numberOfIntegers-1); counter++)
		{
		System.out.println("Weighted sum of digits for integer #" + (counter+1) + ":");
		System.out.println(weightedSums[counter] + "\n");
		}
	}




} //main

} //class






















