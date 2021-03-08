package trianglearea;

import java.util.Scanner;

//Triangle Area Calculator
public class TriangleAreaMain {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Input base print
		System.out.print("Enter triangle base: ");
		
		//Base string replaced "," / "."
		String base = scan.nextLine().replace(",",".");
		
		//Input height print
		System.out.print("Enter triangle height: ");

		//Height string replaced "," / "."
		String height = scan.nextLine().replace(".", ".");
		
		//Formula Triangle Area
		String answer = Double.parseDouble(base)!=0 || Double.parseDouble(height)!=0 ? 
				Double.toString(Double.parseDouble(base)*Double.parseDouble(height)/2):"Invalid";
		
		//Print Answer
		System.out.printf("Triangle Area: %.2f ",Double.parseDouble(answer));
		
		//Scanner close
		scan.close();
		
	}

}
