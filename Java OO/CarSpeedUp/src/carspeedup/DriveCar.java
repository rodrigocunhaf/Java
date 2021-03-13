package carspeedup;

public class DriveCar {
	public static void main(String[] args) {
		
		//Create Ferrari
		Ferrari f1 = new Ferrari();
		
		//Create Civic
		Civic c1 = new Civic();
		
		//Ferrari Accelerated
		f1.speedUp(); f1.speedUp();f1.speedUp();f1.speedUp();
		
		//Civic Accelerated
		c1.speedUp(); c1.speedUp();
		
		System.out.println("#######################################");
		
		//Print brand + velocity + maxSpeed
		System.out.printf("Brand:[%s] velocity:[%.0f/%.0f Km/h]\n",f1.brand,f1.currentSpeed,f1.maxSpeed);
		System.out.printf("Brand:[%s] velocity:[%.0f/%.0f Km/h]\n",c1.brand,c1.currentSpeed,c1.maxSpeed);
		
		//Ferrari break
		f1.speedDown();
		
		//Civic break
		c1.speedDown();
		
		System.out.println("#######################################");
		
		//Print brand + velocity + maxSpeed
		System.out.printf("Brand:[%s] velocity:[%.0f/%.0f Km/h]\n",f1.brand,f1.currentSpeed,f1.maxSpeed);
		System.out.printf("Brand:[%s] velocity:[%.0f/%.0f Km/h]\n",c1.brand,c1.currentSpeed,c1.maxSpeed);
	}
}
