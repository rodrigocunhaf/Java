package calculator;

import java.util.Scanner;

//Calculator
public class CalculatorMain {

	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//First number
		System.out.print("Enter the first number: ");
		double num1 = scan.nextDouble();
		
		//Second number
		System.out.print("Enter the second number: ");
		double num2 = scan.nextDouble();
		
		//Operation
		System.out.print("Enter the operation (+, -, *, / ) :");
		String operator = scan.next();
		
		double answer = "+".equals(operator) ? num1+num2 : 0; //Sum
			   answer = "-".equals(operator) ? num1 - num2 :answer;//Subtraction
			   answer = "*".equals(operator) ? num1*num2 : answer;//Multiplication
			   answer = "/".equals(operator) ? num1/num2 : answer;//Division
	    //Answer
		System.out.printf("%.2f",answer);
		
		//Scanner close
		scan.close();
		
	}
}
