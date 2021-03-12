package eatchallenge;

//Eat Challenge
public class EatMain {
	
	public static void main(String[] args) {
		
		//Create people #1
		People p1 = new People("Ryan",63.2);
		
		//Create people #2
		People p2 = new People("Marissa",49.2);
		
		//Create Food #1
		Food f1 = new Food("Feijão",0.350);
		
		//Create Food #1
		Food f2 = new Food("Arroz",0.200);
		
		//People #1 eat Feijão and Arroz
		p1.eat(f1);
		p1.eat(f2);
		
		//People #2 eat Feijão and Arroz
		p2.eat(f1);
		p2.eat(f2);
		
		//answer with sum people weight + food weight
		System.out.printf("name: %s , Weight: %.2f\n",p1.name,p1.weight);
		System.out.printf("name: %s , Weight: %.2f\n",p2.name,p2.weight);
		
		
		
	}

}
