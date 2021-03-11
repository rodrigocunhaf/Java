package highernumber;

import java.util.Scanner;

//Higher Number
public class HigherNumberMain {

	public static void main(String[] args) {
		
		//Default Higher number
		double higherNumber = 0;
		
		//Count numbers
		double count = 1 ; 
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		while(count <= 10) {
			
			//Input Number
			System.out.printf("Entry number %.0f : ",count);
			double number = scan.nextDouble();
			
			//Higher condition
			if (number > higherNumber) {
				higherNumber = number;
				count++;
			}
			//Smaller condition
			else {
				count++;
			}		
		}
		
		//Answer print
		System.out.printf("Higher Number: %f ",higherNumber);
		
		//Scanner close
		scan.close();
	}
}
