package studentaverageclassification;

import java.util.Scanner;

//Student Average + classification
public class StudentAverageClassificationMain {
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Score#1
		System.out.print("Enter Score #1: ");
		double n1 = scan.nextDouble();
		
		//Score#2
		System.out.print("Enter Score #2: ");
		double n2 =  scan.nextDouble();
		
		//Average
		double studentAverage = (n1+n2)/2;
		
		//Aproved  condition
		if (studentAverage >= 7) {
			System.out.printf("Student Average: %.1f , Aproved.",studentAverage);
		}
		
		//Retake condition
		else if ((studentAverage >= 4) && (studentAverage < 7)){
			System.out.printf("Student Average: %.1f , Retake test.",studentAverage);
		}
		
		//Reproved condition
		else {
			System.out.printf("Student Average: %.1f , Reproved.",studentAverage);
		}
		
		//Scanner close
		scan.close();
	}
}