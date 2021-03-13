package playergame;

public class GameMain {
	
	public static void main(String[] args) {
		
		Player p1 = new Player("Falk");
		
		p1.walk(Direction.North);
		
		System.out.println(p1.posX+" "+p1.posY);
	}
}
