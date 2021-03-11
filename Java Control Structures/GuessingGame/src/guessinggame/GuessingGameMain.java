package guessinggame;

import java.util.Random;
import java.util.Scanner;

//Guessing Game
public class GuessingGameMain {
	
	public static void main(String[] args) {
		
		int count = 10;//Attemps default

		Random num = new Random();
		
		int number = num.nextInt(101);//random int number
		
		//Scanner
		Scanner  scan =  new Scanner(System.in);
		
		do{
			System.out.printf("%d remaining attempts", count);
			System.out.print("\nEntry number: ");
			int entrynumber = scan.nextInt();
			
			//attemps over
			if (count == 1) {
				System.out.printf("Your attempts are over, the number is %d , You lose.\n",entrynumber);
				count--;
			}
			
			// entrynumber == random number
			else if (entrynumber == number ) {
				System.out.printf("Congratulations, the number is %d , you win.\n",entrynumber);
				break;
			}
			
			//entrynumber < number
			else if (entrynumber < number) {
				System.out.printf("Is bigger than %d\n", entrynumber);
				count--;
			}
			
			//entrynumber > number
			else if(entrynumber > number) {
				System.out.printf("It's smaller than %d\n",entrynumber);
				count--;
			}
			
		}
		
		//end
		while(count != 0);
		
		//Scanner close
		scan.close();
	}
}
