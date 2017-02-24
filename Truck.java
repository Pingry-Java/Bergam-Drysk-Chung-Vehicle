public class Truck extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 100;
	private static int seats = 2;
	private static int wheels = 18; 
	private static double cargoCapacity = 1000;
	private static double baseWeight = 750;
 
 
	public Truck()
	{
		time = 0;
		forwardProgress = 0;
		money = 1000; 
		passengers = 2;  
		cargo = 0;
		fuel = fuelCapacity; 
		tires = 4; //4 spare 
		speed = 60;
		engine = new Engine(8); 
	}
	
}