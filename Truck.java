public class Truck extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 100;
	private static int seats = 2;
	private static int wheels = 18; 
	private static int cargoCapacity = 1000;
	private static double baseWeight = 750;
	private static int speed = 50;
 
	/**
	 * constructor for car
	 *@param passengers
	 */
	public Truck(int passengers)
	{
		super.setPassengers(passengers);
		super.setTires(wheels);
		super.setFuelCapacity(fuelCapacity);
		super.setCargoCapacity(cargoCapacity);
		super.setSeats(seats);
		super.setSpeed(speed);
		super.setBaseWeight(baseWeight);
	}
	
}