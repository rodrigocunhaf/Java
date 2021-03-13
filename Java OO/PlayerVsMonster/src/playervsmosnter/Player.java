package playervsmosnter;

//Inheritance Moves
public class Player extends Moves {
	//Health Bar
	int health = 100;
	
	//Position
	int posX = 0;
	int posY = 0;
	
	//Name
	String name;
	
	//Player Constructor
	public Player(String name){
		this.name = name;
	}
	
}
