package challengematrix;

import java.util.Arrays;
import java.util.Scanner;

//Average class
public class ChallengeMatrix {
	public static void main(String[] args) {
		
		//Average class
		double averageScore = 0;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Number of students in the class
		System.out.print("Entry number of students: ");
		int quantyStudents = scan.nextInt();
		
		//Number of grades for each student in the class
		System.out.print("Entry number of scores: ");
		int quantyScores =  scan.nextInt();
		
		//Array 
		double [][] arr = new double [quantyStudents][quantyScores];
		
		//For [Students]
		for(int i = 0; i< arr.length;i++) {
			
			//For [Scores]
			for(int k = 0; k< arr[i].length;k++) {
				
				//Input Score Student
				System.out.printf("Student #%d , Scores #%d: ",i+1,k+1);
				double score = scan.nextDouble();
				
				//Assigning score in the array
				arr[i][k] = score;
				
				//Accumulator scores
				averageScore+=score;
		}
	}
	//Answer average class
	System.out.printf("Average class: %.1f",averageScore/(quantyStudents*quantyScores));
	
	//Scanner close
	scan.close();
	}
}
