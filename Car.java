public class Car extends Vehicle
{
	//Overriding static fields
	private static double fuelCapacity = 70;
	private static int seats = 6;
	private static int wheels = 4; 
	private static int cargoCapacity = 300;
	private static double baseWeight = 750;
	private static int speed = 70;
 
 	/**
	 * constructor for car
	 *@param passengers
	 */
	public Car(int passengers)
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