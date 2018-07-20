/*

http://www.codeabbey.com/index/task_view/sum-of-two

*/


import java.util.*;

public class Prob1
{

	public static void main(String args[])
	{
		int run = 1;
		
		while (run > 0) {
			
		
			String a;		//declare first variable for testing
			String b;		//declare second variable for testing
		
			int integerToSum1 = 0;	//declare first approved integer
			int integerToSum2 = 0;	//declare second approved integer
		
			Scanner input = new Scanner(System.in);		// Create our source of input from the user
			
			System.out.println("\n\n" + "I will sum two integers for you!");
			System.out.println("However, I will limit you to integers between 0 and 500, inclusive.");
			System.out.println("\n" + "What is the first Integer?");
			


				a = input.nextLine();	//get the first input from the user and set it in String a
			
				int testingA = Integer.parseInt(a);		//convert first input to int
			
				if (testingA >= 0 && testingA <= 500)
					{
					integerToSum1 = testingA;
					}
				else 
					{
					System.out.println("Invalid input. Please run program again and utilize the allowed range.");
					System.exit(0);
					}
				
			
			
		
			System.out.println("\n" + "You entered: " + integerToSum1 + "\n");
		
			System.out.println("Great! Now what is the second integer?");
		
				b = input.nextLine();	//get the second input from the user and set it in variable b
			
				int testingB = Integer.parseInt(b);
			
				if (testingB >= 0 && testingB <= 500) 
					{integerToSum2 = testingB;}
				else 
					{System.out.println("Invalid input. Please run program again and utilize the allowed range.");
					System.exit(0);
					}
		
			System.out.println("\n" + "You entered: " + integerToSum2 + "\n");
		
			int summedInts = integerToSum1 + integerToSum2;
		
			System.out.println("The sum of your two designated integers is: " + summedInts + "\n" + "\n");
			
			
			System.out.println("Would you like to sum two more integers?" + "\n" + "1 for yes, 2 for no");
			int response = input.nextInt();
			
			if (response == 2)
				{run = 0;}
			
			
			
			
		}	//while	
		
		
	}	//main
	
}	//class