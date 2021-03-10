package evenodd;

import java.util.Scanner;

// Number even or odd?
public class EvenOddMain {
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Scanner print
		System.out.print("Enter number: ");
		
		//Variable number
		int number =  scan.nextInt();
		
		//Even condition
		if(number % 2 == 0) {
			
			//Even print
			System.out.printf("The number %d is even.",number);
		}
		
		//Odd condition
		else {
			
			//Odd print
			System.out.printf("The number %d is odd",number);
		}
		
		//Scanner close
		scan.close();
	}
}
