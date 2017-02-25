public class Bus extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 100;
	private static int seats = 18;
	private static int wheels = 6; 
	private static int cargoCapacity = 100;
	private static double baseWeight = 750;
	private static int speed = 60;
 
 	/**
	 * constructor for bus
	 *@param passengers
	 */
	public Bus(int passengers)
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