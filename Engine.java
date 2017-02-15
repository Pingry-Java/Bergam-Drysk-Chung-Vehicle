/**
 * this class contains all methods and fields necessary to simulate the engine of a vehicle
 * version - 1.0
 * authors - Miro, Tom, Ethan
 */
public class Engine
{
	private int cylinders;
	
	/**
	 * default constructor that sets the private variable cylinders equal to 1
	 */
	public Engine()
	{
		cylinders = 1;
	}
	
	/**
	 * this constructor takes in the given number of cylinders and sets the private variable
	 * cylinders equal to it
	 *@param cylinders  the given number of cylinders
	 */
	public Engine(int cylinders)
	{
		this.cylinders = cylinders;
	}
	
	/**
	 * returns the private variable cylinders
	 *@return cylinders  the private int representing the car's cylinders
	 */
	public int getCylinders()
	{
		return cylinders;
	}
	
	/**
	 * Returns the volume of fuel required to travel a given distance,
	 * carrying the given total vehicle weight, at the given speed. Note that not all
	 * combinations of arguments are possible. The requested travel is impossible whenever
	 * speed * weight > cylinders * 800. In this case it returns -1
	 *
	 *@param distance  the number of miles the car wants to drive
	 *@param weight  the weight of the car
	 *@param speed  the speed of the car
	 *@return  the volume of fuel needed to travel a given distance given the vehicle's
	 * weight and speed
	 */
	public double fuelRequired(double distance, double weight, double speed)
	{
		if ((speed * weight) > (cylinders * 800))
		{
			return -1;
		}
		return distance * weight * speed;
	}
}
