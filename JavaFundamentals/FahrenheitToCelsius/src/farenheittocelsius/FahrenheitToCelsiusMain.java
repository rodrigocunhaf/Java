package farenheittocelsius;

import java.util.Scanner;

//Conversito Fahrenheit to Celsius
public class FahrenheitToCelsiusMain {
	
	public static void main(String[] args) {
		
		//Scanner print
		System.out.print("Enter temperature in Fahrenheit: ");
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Temperature Fahrenheit input
		double TempF = scan.nextDouble();
		
		//Answer with conversion to Celsius
		System.out.printf("Conversion to Celsius: %.1f C°",(TempF-32)*5/9);
		
		//
		scan.close();
	}
}
