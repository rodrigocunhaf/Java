package playervsmosnter;


public class PlayerVsMonsterMain {
	
	public static void main(String[] args) {
		
		//Create Player
		Player p1 = new Player("Falk");
		
		//Create Monster
		Monster m1 = new Monster("Monster");
		
		//Player walk
		p1.Walk(p1, DirectionEnum.North);
		
		//Print player name,position, Health points
		System.out.printf("Player:[%s] Position [%d,%d] HP[%d]\n",p1.name,p1.posX,p1.posY,p1.health);
		
		//Monster walk
		m1.Walk(m1,DirectionEnum.North);
		m1.Walk(m1,DirectionEnum.North);
		
		//Print monster name,position, Health points
		System.out.printf("Monster:[%s] Position [%d,%d] HP[%d]\n",m1.name,m1.posX,m1.posY,m1.health);
		
		//Player attack [Attack Sucess]
		p1.Atack(p1, m1);
		
		//Monster Walk
		m1.Walk(m1,DirectionEnum.North);
		
		//Print new position, Health points [Player/Monster]
		System.out.printf("Player:[%s] Position [%d,%d] HP[%d]\n",p1.name,p1.posX,p1.posY,p1.health);
		System.out.printf("Monster:[%s] Position [%d,%d] HP[%d]\n",m1.name,m1.posX,m1.posY,m1.health);
		
		//Player attack [Out of range]
		p1.Atack(p1, m1);

	}

}
