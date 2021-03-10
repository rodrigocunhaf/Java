package studentaverage;

import java.util.Scanner;

//Student Average
public class StudentAverageMain {
	public static void main(String[] args) {
	
	//Number of notes typed
	int count = 0;	
	
	//Accumulator notes
	double accum = 0 ;
	
	//Note default 
	double num = 0;
	
	//Scanner
	Scanner scan = new Scanner (System.in);
	
	// While , stop condition = -1
	while (num != -1) {
		
		//Scanner print
		System.out.printf("Enter the %d° note : ",count+1);
		
		//Note
		num = scan.nextDouble();
		
		//Valid note condition
		if(( num >= 0 )&&( num <= 10 )) {
			accum+=num; 
			count++;
		}
		//Invalid note condition
		else if (num != -1){
			System.out.println("Invalid note, Try again!");
		}
	}
	//print with Student Average
	System.out.printf("Student Average: %.1f",accum/count);
	
	//Scanner close
	scan.close();
	}
}

