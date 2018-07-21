/*

http://www.codeabbey.com/index/task_view/modulo-and-time-difference

Problem:
	Given two timestamps, return the amount of time elapsed between them.


*/



import java.util.*;


public class Prob12
{

public static void main(String args[])
{

Scanner input = new Scanner(System.in);

System.out.println("Greetings!\nGiven two time stamps in the same month, I can tell you the amount of elapsed time between them!\n");

int numberOfElapsed;

System.out.println("How many elapsed times would you like me to evaluate?");
numberOfElapsed = input.nextInt();

System.out.println("\nSounds good!\n");

int[] day1 = new int[numberOfElapsed];
int[] hour1 = new int[numberOfElapsed];
int[] min1 = new int[numberOfElapsed];
int[] sec1 = new int[numberOfElapsed];

int[] day2 = new int[numberOfElapsed];
int[] hour2 = new int[numberOfElapsed];
int[] min2 = new int[numberOfElapsed];
int[] sec2 = new int[numberOfElapsed];

int counter;

for (counter = 0; counter <= (numberOfElapsed-1); counter++)
	{
	
	System.out.println("For elapsed time calculation #" + (counter+1) + ":");
	
	System.out.println("Time 1:");
	
	System.out.println("Day?");
	day1[counter] = input.nextInt();
	System.out.println("Hour?");
	hour1[counter] = input.nextInt();
	System.out.println("Minute?");
	min1[counter] = input.nextInt();
	System.out.println("Second?");
	sec1[counter] = input.nextInt();
	
	System.out.println("\nAlright, now Time 2:");

	System.out.println("Day?");
	day2[counter] = input.nextInt();
	System.out.println("Hour?");
	hour2[counter] = input.nextInt();
	System.out.println("Minute?");
	min2[counter] = input.nextInt();
	System.out.println("Second?");
	sec2[counter] = input.nextInt();	
	
	System.out.print("\n");
	
	}

int[] elapsedDays = new int[numberOfElapsed];
int[] elapsedHours = new int[numberOfElapsed];
int[] elapsedMinutes = new int[numberOfElapsed];
int[] elapsedSeconds = new int[numberOfElapsed];
int[] time1TotalSeconds = new int[numberOfElapsed];
int[] time2TotalSeconds = new int[numberOfElapsed];
int[] totalElapsedSeconds = new int[numberOfElapsed];

for (counter = 0; counter <= (numberOfElapsed-1); counter++)
	{
	
	time1TotalSeconds[counter] += sec1[counter];
	time1TotalSeconds[counter] += (min1[counter] * 60);
	time1TotalSeconds[counter] += (hour1[counter] * 60 * 60);
	time1TotalSeconds[counter] += (day1[counter] * 24 * 60 * 60);
	
	time2TotalSeconds[counter] += sec2[counter];
	time2TotalSeconds[counter] += (min2[counter] * 60);
	time2TotalSeconds[counter] += (hour2[counter] * 60 * 60);
	time2TotalSeconds[counter] += (day2[counter] * 24 * 60 * 60);
	
	totalElapsedSeconds[counter] = (time2TotalSeconds[counter] - time1TotalSeconds[counter]);
	
	if (totalElapsedSeconds[counter] < 0)
		{
		totalElapsedSeconds[counter] = (totalElapsedSeconds[counter] * (-1));
		}
	
	elapsedDays[counter] = (totalElapsedSeconds[counter] / (24*60*60));
	totalElapsedSeconds[counter] = totalElapsedSeconds[counter] - (elapsedDays[counter] * (24*60*60));
	
	elapsedHours[counter] = (totalElapsedSeconds[counter] / (60*60));
	totalElapsedSeconds[counter] = totalElapsedSeconds[counter] - (elapsedHours[counter] * (60*60));
	
	elapsedMinutes[counter] = (totalElapsedSeconds[counter] / 60);
	totalElapsedSeconds[counter] = totalElapsedSeconds[counter] - (elapsedMinutes[counter] * 60);
	
	elapsedSeconds[counter] = totalElapsedSeconds[counter];
	}



for (counter = 0; counter <= (numberOfElapsed-1); counter++)
	{
	
	System.out.println("Total elapsed time #" + (counter+1) + ":");
	System.out.print(elapsedDays[counter] + " Days, " + elapsedHours[counter] + " Hours, ");
	System.out.print(elapsedMinutes[counter] + " Minutes, and " + elapsedSeconds[counter]);
	System.out.print(" Seconds\n\n");
	
	}









} //main

} //class







