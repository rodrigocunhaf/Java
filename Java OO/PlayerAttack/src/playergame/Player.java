package playergame;

public class Player {
	
	String name;
	int posX = 0;
	int posY = 0;

	public Player (String name) {
		this.name = name;
	}
	
	void walk(Direction direction) {
		switch(direction) {
		case North:
			posY++;
			break;
		
		case South:
			posY--;
			break;
			
		case East:
			posX++;
			break;
		
		case West:
			posX--;
			break;
		}
	}
}