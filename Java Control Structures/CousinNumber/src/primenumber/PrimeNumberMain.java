package primenumber;

import java.util.Scanner;

//Number is cousin?
public class PrimeNumberMain {
	
	public static void main(String[] args) {
		
		//Dividers count
		int count = 0;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Input number
		System.out.print("Entry Number: ");
		int number =  scan.nextInt();
		
		for (int i = 1; i <= number;i++) {	
			//Dividers condition
			if (number % i == 0) {
				
				//Divider counter assignment
				count++;
			}
		}
		
		//Cousin condition
		if (count == 2 ) {
			System.out.printf("The number %d is cousin.",number);
		}
		
		//it's not cousin
		else {
			System.out.printf("The number %d isn't cousin.",number);
		}
		
		//Scanner close
		scan.close();
	}

}
