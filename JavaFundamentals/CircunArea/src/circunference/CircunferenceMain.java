package circunference;

import java.util.Scanner;

public class CircunferenceMain {
	public static void main(String[] args) {
		
		//Scanner print
		System.out.print("Enter the radius value of the circumference:");
		
		//Scanner
	 	Scanner scan  =  new Scanner(System.in);
	 	
	 	//Pi value
	 	final double pi = 3.14;
	 	
	 	//Radius input
	 	double radius = scan.nextDouble();
	 	
	 	//Answer Print
	 	System.out.printf("The circumference area is: %.2f ",pi*Math.pow(radius,2));
	 	
	 	//Scanner close
	 	scan.close();
 	}
}
