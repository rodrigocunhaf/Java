package playervsmosnter;

//Moviments player
public class Moves {
	
	//Walk Move
	void Walk(Player player, DirectionEnum direction){
		switch (direction) {
		case North:
			player.posY++;
			break;
		case South:
			player.posY--;
			break;
		case East:
			player.posX++;
			break;
		case West:
			player.posX--;
		}
	}
	
	//Attack Move
	void Atack(Player player, Player target) {
		
		//Reach condition
		if ((Math.abs(player.posX - target.posX) <= 1) && (Math.abs(player.posY - target.posY) <= 1)){
			System.out.println("ATTACK SUCESS!!!");
			
			//Target's life reduction
			target.health-=10;
		}
		
		//Out of range
		else {
			System.out.println("OUT OF RANGE.");
		}
	}
}
