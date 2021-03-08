package secondegreefunction;

//ax² + bx + c , a= 1 , b=12, c=-13 
public class SecondDegreeFunctionMain {
	public static void main(String[] args) {
		
		int a = 1;//Value a
		int b = 12;//Value b
		int c = -13;//Value c
		
		//delta
		double delta = Math.pow(b, 2) - 4*a*c;
		
		//Delta print
		System.out.printf("Delta = %.0f\n",delta);
		
		//x' print
		System.out.printf("x'= %.0f\n",(-b + Math.sqrt(delta))/(2*a));
		
		//x'' print
		System.out.printf("x''= %.0f",(-b - Math.sqrt(delta))/(2*a));
	}

}
