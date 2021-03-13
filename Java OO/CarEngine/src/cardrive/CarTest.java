package cardrive;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		//Car method speedup
		c1.SpeedUp();
		
		//Car engine is on? No
		System.out.println("Car engine is on? "+c1.isOn());
		
		//Car engine on
		c1.on();
		
		//Car engine is on? Yes
		System.out.println("Car engine is on? "+c1.isOn());
		
		//Speedup
		c1.SpeedUp();
		
		//Car engine turns
		System.out.println("Car engine turn: "+c1.engineCar.engineTurns());
		
		//break
		c1.SpeedBreak();
		c1.SpeedBreak();//message "The car is stopped"
		
		//Car engine turns
		System.out.println("Car engine turn: "+c1.engineCar.engineTurns());
		
		//Car engine off
		c1.off();
		
		//Car engine is on? No
		System.out.println(c1.isOn());
		
	}

}
