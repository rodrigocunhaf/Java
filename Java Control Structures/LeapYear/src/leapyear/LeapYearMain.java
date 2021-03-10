package leapyear;

import java.util.Scanner;

//Is a Leap Year?
public class LeapYearMain {
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Scanner print
		System.out.print("Type a year: ");
		
		//Variable year
		int year  = scan.nextInt();
		
		//First leap year condition
		if ((year % 4 == 0) && (year % 100 != 0)){
			System.out.println(true);
		}
		
		//Second leap year condition
		else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			System.out.printf("%d is a leap year? %b",year,true);
		}
		
		//NOT leap year condition
		else {
			System.out.printf("%d is a leap year? %b",year,false);
		}
		
		//Scanner close
		scan.close();
	}

}
