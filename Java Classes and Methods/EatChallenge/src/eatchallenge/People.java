package eatchallenge;

public class People {
	//People name
	String name;
	
	//People weight
	double weight;
	
	//People constructor
	People(String name , double weight){
		this.name = name;
		this.weight = weight;
		
	}
	
	//method Eat ( sum food weight+ people weight)
	public void eat(Food foodname) {
		this.weight+=foodname.weight;	
	}
}
