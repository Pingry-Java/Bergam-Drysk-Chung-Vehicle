public class Bus extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 100;
	private static int seats = 18;
	private static int wheels = 6; 
	private static double cargoCapacity = 100;
	private static double baseWeight = 750;
 
 	/**
	 * default constructor for bus
	 */
	public Bus()
	{
		time = 0;
		forwardProgress = 0;
		money = 1000; 
		passengers = 18;  
		cargo = 0;
		fuel = fuelCapacity; 
		tires = 2; // 2 spare 
		speed = 60;
		engine = new Engine(8); 
	}
	
}