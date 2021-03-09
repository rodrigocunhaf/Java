package dayweek;

import java.util.Scanner;

//Enter a integer number, receive a day of the week
public class DayWeekMain {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//First print
		System.out.print("Enter a number: ");
		
		//Variable
		int num = scan.nextInt();
		
		//Sunday condition
		if (num == 1) {
			System.out.println("Sunday");
		}
		
		//Monday condition
		else if (num == 2) {
			System.out.println("Monday");
		}
		
		//Tuesday condition
		else if (num == 3) {
			System.out.println("Tuesday");
		}
		
		//Wednesday condition
		else if (num == 4) {
			System.out.println("Wednesday");
		}
		
		//Thursday condition
		else if (num == 5) {
			System.out.println("Thursday");
		}
		
		//Friday condition
		else if (num == 6) {
			System.out.println("Friday");
		}
		
		//Saturday condition
		else if (num == 7) {
			System.out.println("Saturday");
		}
		
		//Invalid input condition
		else {
			System.out.println("Invalid");
		}
		
		//Scanner close
		scan.close();
	}

}
