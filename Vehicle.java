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
	
	
	//Static initializer
	//creates the gas stops and their spacing
	static
	{
		gasStops = new int[10];
		for (int n = 0; n < 10; n++){
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
		fuel -= engine.fuelRequired(this.distanceToNextStop(), this.totalWeight(), this.getSpeed());
		milesToDestination -= this.distanceToNextStop();
		forwardProgress += this.distanceToNextStop();
		if ((engine.fuelRequired(speed, distanceToGas, cargo) == -1)
    		this.isStranded() == false; 
		if (chances > 1.0)
				this.isStranded() == false;
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
		if ((engine.fuelRequired(speed, distanceToGas, cargo) == -1)
    		this.isStranded() == false;
		else 
		{
     		forwardProgress += miles;
			totalTime += speed * miles; 
			fuel -= (miles/mpg + passengers + cargo);	
			refuel(fuelCapacity);
			if (chances > 1.0)
				this.isStranded() == false;
			chances += .1;
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
	public boolean isStranded()'
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

	public double getFuelCapacity()
	{
  		return fuelCapacity;  
	} 
 	
	public int getSeats()
 	{
  		return seats; 
 	} 
 	
 	public int getWheels()
	{
		return wheels; 
	} 
 	
	public double getCargoCapacity()
 	{
 		return cargoCapacity; 
 	} 

	public double getBaseWeight()
	{
		return baseWeight; 
	} 
	
	public double getMoney()
	{
		return money; 
	} 

	public double getFuel()
	{
		return fuel; 
	} 
	
	public int getPassengers()
	{
		return passengers; 
	} 
	
	public double getCargo()
	{
		return cargo; 
	} 

	public int getTires()
	{
		return tires; 
	} 

	public double getForwardProgress()
	{
		return forwardProgress; 
	}
 
	public double getSpeed()
	{
		return speed; 
	} 

	public double getTime()
	{
		return time; 
	} 

// MODIFIERS

	public void setFuelCapacity(double fuelCapacity)
	{
  		this.fuelCapacity = fuelCapacity; 
	} 

	public void setSeats(int seats)
	{
		this.seats = seats; 
	} 
	
	public void setWheels(int wheels)
	{
  		this.wheels = wheels; 
	} 
	
	public void setCargoCapacity(double cargoCapacity)
	{
		this.cargoCapacity = cargoCapacity; 
	} 
	
	public void setBaseWeight(double baseWeight)
	{
		this.baseWeight = baseWeight;
	} 
 
	public void setMoney(double money)
	{
		this.money = money; 
	} 

	public void setFuel(double fuel)
	{
		this.fuel = fuel; 
	} 

	public void setPassengers(int passengers)
	{
		this.passengers = passengers; 
	} 
	
	public void setCargo(double cargo)
	{
		this.cargo = cargo;
	} 
 
	public void setTires(int tires)
	{
		this.tires = tires; 
	} 

	public void setForwardProgress(int forwardProgress)
	{
		this.forwardProgress = forwardProgress; 
	} 

	public void setSpeed(double speed)
	{
		this.speed = speed;
	} 
 	
 	public void setTime(double time)
	{
		this.time = time;
	} 
	
}