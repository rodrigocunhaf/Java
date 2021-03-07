package bmicalculator;

import java.util.Scanner;

//Body Mass Index Calculator
public class BMICalculator {
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Height
		System.out.print("Enter height: ");
		String height = scan.nextLine().replace(",",".");
		
		//Weight
		System.out.print("Enter weight: ");
		String weight = scan.nextLine().replace(",",".");
		
		//Formula Body Mass Index Calculator
		double bmi = Double.parseDouble(weight)/Math.pow(Double.parseDouble(height),2);
		
		
		//Answer
		String answer = bmi < 18.5 ? "Thinness" : "Invalid";
			   answer = bmi >= 18.5 && bmi <= 24.9 ? "Normal" : answer;
			   answer = bmi >= 25 && bmi <= 29.9 ? "Obesity Grade I" : answer;
			   answer = bmi >= 30 && bmi <= 39.9 ? "Obesity Grade II" : answer;
			   answer = bmi > 40 ? "Obesity Grade III" : answer;
			   
		//Print Answer
		System.out.println(answer);
		
		//Scanner close
		scan.close();
	}

}
