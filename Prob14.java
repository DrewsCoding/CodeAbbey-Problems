/*

http://www.codeabbey.com/index/task_view/modular-calculator

Problem:
	-Create a modular calculator, that takes in user input for arguments to be applied,
		and then finishes off with a modula calculation, of user-inputed value.
	
		
Thought-process:
	-repeatedly ask for the next argument
		-say it must be the operator + *space* + value
	-split argument by space
	-store the two parts in an array
	-use if statements to look at the first part
		-do operation on finalNumber with the matched operator and part 2 of argument,
			stored in array
	-user's concluding argument must contain modula to finish off the calculations
	-print the finalNumber


*/




import java.util.*;


public class Prob14
{

public static void main(String args[])
{


	Scanner input = new Scanner(System.in);
	
	System.out.println("\n\nModular Calculator\n");
	System.out.print("Instructions: You will be asked for an initial integer, and ");
	System.out.print("then subsequently asked for each additional operation you would ");
	System.out.print("like performed.  Your final desired operation must be a modula ");
	System.out.println("operation. Then the result will be printed.\n");
	System.out.print("NOTE: after initial integer is provided, all desired operations");
	System.out.print(" must be provided in the format:\nOperator + *SPACE* + Integer\n\n");

	int number = 0;

	System.out.println("Initial Integer?");
	number = input.nextInt();
	
	String nextOperation;
	boolean keepRunning = true;
	
	int argumentNumber;
	int count = 1;
	
	
	do	{
		
		System.out.println("Operation?");
		if (count == 1)
			{nextOperation = input.nextLine();}
		nextOperation = input.nextLine();
		
		String[] parts = nextOperation.split(" ");
		
		argumentNumber = Integer.parseInt(parts[1]);
		
		
		if (parts[0].contains("*"))
			{
			number = number * argumentNumber;
			}
		
		if (parts[0].contains("/"))
			{
			number = number / argumentNumber;
			}
		
		if (parts[0].contains("+"))
			{
			number = number + argumentNumber;
			}
		
		if (parts[0].contains("-"))
			{
			number = number - argumentNumber;
			}
		
		if (parts[0].contains("%"))
			{
			number = number % argumentNumber;
			keepRunning = false;
			}
			
		count++;
		
		} while (keepRunning);
		
		

	System.out.println("\nResult:");
	System.out.println(number);





} //main

} //class












