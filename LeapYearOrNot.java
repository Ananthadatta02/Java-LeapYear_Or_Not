package test_27_03_25;

import java.util.Scanner;

public class LeapYearOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = s.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}
