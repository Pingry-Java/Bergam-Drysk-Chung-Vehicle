public class Car extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 70;
	private static int seats = 6;
	private static int wheels = 4; 
	private static double cargoCapacity = 300;
	private static double baseWeight = 750;
 
 	/**
	 * default constructor for car
	 */
	public Car()
	{
		time = 0;
		forwardProgress = 0;
		money = 1000; 
		passengers = 6;  
		cargo = 0;
		fuel = fuelCapacity; 
		tires = 2; //2 spare 
		speed = 70;
		engine = new Engine(6); 
	}
	
}