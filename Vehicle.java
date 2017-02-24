public class Vehicle
{
	//static
	private static double fuelCapacity;
	private static int seats = 4;
	private static int wheels = 4; //override in smaller classes
	private static double cargoCapacity;
	private static double baseWeight = 1000;
	
	private static int[] gasStops;
	private static final int endpoint = 2890;  //endpoint is 3000 miles away
	
	//non-static
	private double money;
	private double fuel;
	private int passengers;
	private double cargo;
	private int tires; //this is number of SPARE tires
	private double blowOut;
	private double forwardProgress;
	private double speed;
	private double time; //time elapsed on journey
	private Engine engine;
	
	private double chances = .1;
	//Static initializer
	//creates the gas stops and their spacing
	static
	{
		gasStops = new int[10];
		for (int n = 0; n < 10; n++)
			gasStops[n] = 200 * (n+1); 
	}
	
	/**
	 * Default Vehicle constructor
	 */
	public Vehicle()
	{
		engine = new Engine(); //call Engine's default constructor (has-a)
		fuelCapacity = 50; //gallons  
		fuel = 50; //gallons
		cargoCapacity = 500;  //lb of cargo
		cargo = 100; //lbs of cargo
		passengers = 2; //People 
		money = 1000;
		tires = 2;  //two spare tires
		forwardProgress = 0; //Miles 
		speed = 60; //Mph 
		
  	}
	
	/**
	 * Method Drives the vehicle to the next gas station.
	 */
	public void drive()
	{
		double required = (engine.fuelRequired(distanceToNextStop(), cargo, speed));
		if (required > 0)
		{
			fuel -= engine.fuelRequired(distanceToNextStop(), cargo, speed);
			forwardProgress += this.distanceToNextStop();
		}
		if (chances > 1.0)
			required = -1;
		chances += .1;
	}

	/**
	 * method Drives the vehicle to the next gas station past the minimum distance provided.
	 * Either drive method will leave the user stranded on the side of the road if they have
	 * insufficient fuel to reach the gas station. 
	 * Either drive method should should have a certain probability of tires blowing out that
	 * increases as drive distance increases.
	 * @param miles the vehicle wants to drive
	 */
	public void drive(int miles) 
	{
		double required = (engine.fuelRequired(speed, distanceToNextStop(), cargo));
		if (required > 0)
		{
     		forwardProgress += miles;
			time += speed * miles; 
			fuel -= (miles + passengers + cargo);	
			fillGas();
			if (chances > 1.0)
				required = -1;
			chances += .1;
		}
	}
	
	/**
	 * Method fills the gas tank; subtracts the money the gas cost
	 */
	public void fillGas()
	{
		double needGas = fuelCapacity - fuel;
		fuel += needGas;
		money -= (2.75 * needGas); //dollar per gallon
	}
	
	/**
	 * Method calculates the weight of the vehicle with its combined items/pasengers
	 * @return the amount of weight, in pounds, of the vehicle plus cargo.
	 */
	public double totalWeight()
	{
		return baseWeight + cargo + (passengers * 150); 
	}
	
	/**
	 * method check is the vehicle has reached the finish line 
	 * @return whether you've reached your destination. Indicates a game-over condition
	 */
	public boolean arrived()
	{
		return (forwardProgress >= endpoint);
	}
	
	/**
	 * Checks if a vehicle is stranded 
	 * @return boolean whether your vehicle has become stranded either with no money, or
	 * without gas or tires in the middle of the road. Indicates a game-over condition
	 */
	public boolean isStranded()
	{
		return (fuel <= 0 || money <= 0 || tires < 4);
	}
	
	/**
	 * Checks the distance a vehicle must travel to the next gas stop
	 * @return the number of miles until the vehicle will arrive at the next gas stop
	 */
	public double distanceToNextStop()
	{
		return forwardProgress % 200; 
	}

//ACCESSORS
	/**
	* This method returns fuel capacity
	* @return Returns fuel capacity
	*/
	public double getFuelCapacity()
	{
  		return fuelCapacity;  
	} 
 	
 	/**
	* This method returns the number of seats
	* @return Returns seats
	*/
	public int getSeats()
 	{
  		return seats; 
 	} 
 	
 	/**
	* This method returns the number of wheels
	* @return Returns wheels
	*/
 	public int getWheels()
	{
		return wheels; 
	} 
 	/**
	* This method returns the cargo capacity
	* @return Returns cargo capacity
	*/
	public double getCargoCapacity()
 	{
 		return cargoCapacity; 
 	} 
	
	/**
	* This method returns the Vehicle's base weight
	* @return Returns base weight
	*/
	public double getBaseWeight()
	{
		return baseWeight; 
	} 
	
	/**
	* This method returns the player's money
	* @return Returns money
	*/
	public double getMoney()
	{
		return money; 
	} 

	/**
	* This method returns the fuel
	* @return Returns fuel
	*/
	public double getFuel()
	{
		return fuel; 
	} 
	
	/**
	* This method returns the number of passengers
	* @return Returns passengers
	*/
	public int getPassengers()
	{
		return passengers; 
	} 
	
	/**
	* This method returns the cargo
	* @return Returns cargo
	*/
	public double getCargo()
	{
		return cargo; 
	} 
	
	/**
	* This method returns the number of spare tires
	* @return Returns tires
	*/
	public int getTires()
	{
		return tires; 
	} 
	
	/**
	* This method returns the forward progress
	* @return Returns forward progress
	*/
	public double getForwardProgress()
	{
		return forwardProgress; 
	}
 	
 	/**
	* This method returns the speed
	* @return Returns speed
	*/
	public double getSpeed()
	{
		return speed; 
	} 
	
	/**
	* This method returns the time 
	* @return Returns time
	*/
	public double getTime()
	{
		return time; 
	} 

// MODIFIERS

	/**
	* This method sets fuel capacity as to a new value 
	* @param fuelCapacity The fuel capacity of the vehicle
	*/
	public void setFuelCapacity(double fuelCapacity)
	{
  		this.fuelCapacity = fuelCapacity; 
	} 

	/**
	* This method sets number of seats to a new value 
	* @param seats The number of seats in the vehicle
	*/
	public void setSeats(int seats)
	{
		this.seats = seats; 
	} 
	
	/**
	* This method sets number of wheels to a new value 
	* @param wheels The number of wheels in the vehicle
	*/
	public void setWheels(int wheels)
	{
  		this.wheels = wheels; 
	} 
	
	/**
	* This method sets the cargo capacity to a new value 
	* @param cargoCapacity The amount of cargo the car can hold
	*/
	public void setCargoCapacity(double cargoCapacity)
	{
		this.cargoCapacity = cargoCapacity; 
	} 
	
	/**
	* This method sets the base weight to a new value 
	* @param baseWeight The base weight of the vehicle
	*/
	public void setBaseWeight(double baseWeight)
	{
		this.baseWeight = baseWeight;
	} 
 
 	/**
	* This method sets money of the player to a new value 
	* @param money The amount of money the player as
	*/
	public void setMoney(double money)
	{
		this.money = money; 
	} 
	
	/**
	* This method sets the fuel to a new value 
	* @param fuel The amount of fuel in the vehicle
	*/
	public void setFuel(double fuel)
	{
		this.fuel = fuel; 
	} 
	
	/**
	* This method sets number of passnegers to a new value 
	* @param passengers The number of passengers in the vehicle
	*/
	public void setPassengers(int passengers)
	{
		this.passengers = passengers; 
	} 
	
	/**
	* This method sets the amount of cargo to a new value 
	* @param cargo The amount of cargo in the vehicle
	*/
	public void setCargo(double cargo)
	{
		this.cargo = cargo;
	} 
 
 	/**
	* This method sets the amount of tires to a new value 
	* @param tires The amount of tires on the vehicle
	*/
	public void setTires(int tires)
	{
		this.tires = tires; 
	} 
	
	/**
	* This method sets the forward progress to a new value 
	* @param forwardProgress How far the player has travelled in the game
	*/
	public void setForwardProgress(int forwardProgress)
	{
		this.forwardProgress = forwardProgress; 
	} 

	/**
	* This method sets the speed to a new value 
	* @param speed The speed of the vehicle
	*/
	public void setSpeed(double speed)
	{
		this.speed = speed;
	} 
 	
 	/**
	* This method sets the time to a new value 
	* @param time The time that has elapsed so far on the journey
	*/
 	public void setTime(double time)
	{
		this.time = time;
	} 
	
}