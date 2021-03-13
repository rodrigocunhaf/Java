package carspeedup;

public class CarClass {
	
	//Car name
	String brand;
	
	//acelerationFactor by brand
	int acelerationFactor;
	
	//Current speed car
	double currentSpeed = 0;
	
	//Max Speed by brand
	double maxSpeed;
	
	//Car constructor
	public CarClass(String brand, double maxSpeed,int acelerationFactor){
		this.brand =  brand;
		this.maxSpeed = maxSpeed;
		this.acelerationFactor = acelerationFactor;
	}
	
	//Car acceleration
	void speedUp() {
		
		//Currentspeed + aceleration > max speed car?
		if ((this.currentSpeed + (this.acelerationFactor*25)) < this.maxSpeed) {
			//Increase speed
			this.currentSpeed+= (this.acelerationFactor*25);
		}
		//Max speed cap
		else {
		
			this.currentSpeed = this.maxSpeed;
		}
	}
	
	//Car break
	void speedDown() {
		
		//Car is stopped?
		if (this.currentSpeed > 0) {
			
			//Decrease speed
			this.currentSpeed-= (this.acelerationFactor*25);
		}
	}
}
