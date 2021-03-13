package cardrive;

public class Car {
	
	//Car engine
	EngineCar engineCar = new EngineCar();
	
	//Return "Car engine is on?"
	boolean isOn() {
		return engineCar.engine;
	}
	
	//Turn on car engine
	void on() {
		engineCar.engine = true;
	}
	
	//Turn off car engine
	void off() {
		engineCar.engine= false;
	}
	
	//Speedup Car
	void SpeedUp(){
		
		//Car engine is on?
		if (engineCar.engine == true) {
			engineCar.fuelconsumption+=1;
		}
		else {
			System.out.println("Car off");
		}
	}
	
	void SpeedBreak() {
		
		//Car is stopped?
		if (engineCar.fuelconsumption == 0) {
			System.out.println("The car is stopped");
		}
		else {
			engineCar.fuelconsumption-=1;
		}
	}

}