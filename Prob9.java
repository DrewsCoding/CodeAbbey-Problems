/*

http://www.codeabbey.com/index/task_view/triangles

Problem:
	Given 3 input side lengths of a triangle, tell the user whether the side lengths
		are able to create a triangle.  (The sum of two side lengths must be greater than
		the length of the third.)
		
Thought-process:
	-Greeting
	-Ask how many triangles they would like evaluated
	-For each triangle:
		-ask for each of the three side lengths
	-evaluate the sides, to make sure that two of the sides are always greater
		than the third.
	-use arrays to store side lengths A, B, and C for each traingle.
	-set a variable value that signals the side lengths will work
	-series of if statements, testing A + B > C, A + C > B, B + C > A
		-if any of them fails, then change the signal to fail
	-print the results	
	
*/



import java.util.*;




public class Prob9
{

public static void main(String args[])
{


Scanner input = new Scanner(System.in);

System.out.println("Greetings!\nGiven 3 side lengths, I can tell you if they could be used to create a triangle!");

int numberOfTriangles;

System.out.println("How many sets of side lengths would you like for me to evaluate?");
numberOfTriangles = input.nextInt();

System.out.print("\n\n");

int[] As = new int[numberOfTriangles];
int[] Bs = new int[numberOfTriangles];
int[] Cs = new int[numberOfTriangles];
int[] works = new int[numberOfTriangles];

int counter;

for (counter = 0; counter <= (numberOfTriangles-1); counter++)
	{
	
	System.out.println("For set #" + (counter + 1) + ":");
	
	System.out.println("What is the first side length?");
	As[counter] = input.nextInt();
	
	System.out.println("What is the second side length?");
	Bs[counter] = input.nextInt();
	
	System.out.println("What is the third side length?");
	Cs[counter] = input.nextInt();
	
	System.out.println("\n");
	
	works[counter] = 1;
	
	}


for (counter = 0; counter <= (numberOfTriangles-1); counter++)
	{
	
	if ((As[counter] + Bs[counter]) < Cs[counter])
		{works[counter] = 0;}
		
	if ((As[counter] + Cs[counter]) < Bs[counter])
		{works[counter] = 0;}
		
	if ((Bs[counter] + Cs[counter]) < As[counter])
		{works[counter] = 0;}
	
	}
	
System.out.println("\n\nOkay! I have the results!\n");

for (counter = 0; counter <= (numberOfTriangles-1); counter++)
	{
	
	System.out.print("Triangle #" + (counter + 1) + ", with sides: " + As[counter] + ", ");
	System.out.println(Bs[counter] + ", and " + Cs[counter] + ":");
	
	if (works[counter] == 1)
		{System.out.println("Will work!!\n");}
	else
		{System.out.println("Won't work as a triangle..\n");}
	
	}


} //main

} //class















