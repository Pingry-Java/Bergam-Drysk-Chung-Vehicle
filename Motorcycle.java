public class Motorcycle extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 40;
	private static int seats = 2;
	private static int wheels = 2; 
	private static int cargoCapacity = 100;
	private static double baseWeight = 500;
	private static int speed = 100;
 
 	/**
	 * constructor for car
	 *@param passengers
	 */
	public Motorcycle(int passengers)
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