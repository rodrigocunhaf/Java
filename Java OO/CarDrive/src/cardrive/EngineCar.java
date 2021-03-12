package cardrive;

public class EngineCar {
	//Engine status
	boolean engine = false;
	
	//Fuel consumption
	double fuelconsumption = 0;
	
	//Return engine turns
	int engineTurns() {
		return (int) Math.round(fuelconsumption*500);
	}
}
