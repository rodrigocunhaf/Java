package cousinnumberswitch;

import java.util.Scanner;

public class CousinNumberSwitchMain {
	public static void main(String[] args) {
		
		int count = 0 ;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Input Number
		System.out.print("Entry number: ");
		int number = scan.nextInt();
		
		for (int i = 1 ; i<=number;i++ ) {
			//Dividers condition
			if ( number % i == 0) {
				//Divider counter assignment
				count++;
			}
		}
		switch(count) {
		
		//Case cousin
		case 2:
			System.out.printf("The number %d is cousin.",number);
			break;
			
		//Case isn't cousin
		default:
			System.out.printf("The number %d is cousin.",number);
		}
		
		//Scanner close
		scan.close();
	}

}
