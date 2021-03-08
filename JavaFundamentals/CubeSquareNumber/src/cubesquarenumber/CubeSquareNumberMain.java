package cubesquarenumber;

import java.util.Scanner;

//Calculate cube and square of a number

public class CubeSquareNumberMain {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Scanner print
		System.out.print("Enter a number: ");
		
		//Number String, replaced ","/ "."
		String num = scan.nextLine().replace(",", ".");
		
		//Square
		System.out.printf("(%s)² = %.2f\n",num,Math.pow(Double.parseDouble(num), 2));
		
		//Cube
		System.out.printf("(%s)³ = %.2f",num,Math.pow(Double.parseDouble(num), 3));
		
		//Scanner Close
		scan.close();
	}

}
