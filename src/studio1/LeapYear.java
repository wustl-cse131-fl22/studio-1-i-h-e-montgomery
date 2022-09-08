package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		int year = in.nextInt();
		
		boolean isLeapYear;
		
		int divisableByFour = year % 4;
		int divisableByHundred = year % 100;
		int divisableByFourHundred = year % 400;
		
		isLeapYear = ((divisableByFour == 0) && (divisableByHundred != 0)) || (divisableByFourHundred == 0);
		System.out.print(year + " is a leap year: " + isLeapYear);
		
		
	}

}
