public class Motorcycle extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 40;
	private static int seats = 2;
	private static int wheels = 2; 
	private static double cargoCapacity = 100;
	private static double baseWeight = 500;
 
 	/**
	 * default constructor for motorcycle
	 */
	public Motorcycle()
	{
		time = 0;
		forwardProgress = 0;
		money = 1000; 
		passengers = 2;  
		cargo = 0;
		fuel = fuelCapacity; 
		tires = 1; //1 spare 
		speed = 65;
		engine = new Engine(4); 
	}
 
}