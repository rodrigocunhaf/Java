package studentaveragearray;

import java.util.Scanner;

public class StudentAverageArrayMain {
	
	public static void main(String[] args) {
		
		//Default student average
		double studentAverage = 0;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Entry quantity score
		System.out.print("Entry score quantity: ");
		int count = scan.nextInt();
		
		//Array scores, length = count
		double [] scoreArray = new double[count];
		
		for (int i = 0 ; i < count;i++) {
			// Entry score
			System.out.print("Entry score valor: ");
			double studentScore = scan.nextDouble();
			
			//Add score in scoreArray
			scoreArray[i] = studentScore;
			
			//Accumulator score
			studentAverage += studentScore;
		}
		
		//Answer student average
		System.out.printf("Student average: %.1f ",studentAverage/count);
		
		//Scanner close
		scan.close();
	}

}
