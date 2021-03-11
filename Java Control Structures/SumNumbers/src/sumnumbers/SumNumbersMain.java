package sumnumbers;

import java.util.Scanner;

//Accumulator
public class SumNumbersMain {
	
	public static void main(String[] args) {
		
		//Default Accumulator
		double accum = 0;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			//Input number
			double entryNumber = scan.nextDouble();
			
			//Stop loop condition
			if (entryNumber < 0) {
				break;
			}
			
			//Sum accumulator condition
			else {
				accum+=entryNumber;
				System.out.println(accum);
			}	
		}
		
		//Scanner close
		scan.close();
	}
}
