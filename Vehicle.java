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
	private double forwardProgress;
	private double speed;
	private double time; //time elapsed on journey
	private Engine engine;
	
	
	
	//Static initializer
	static
	{
		gasStops = new int[10];
		int counter = 0;
		for(int i = 1; i < 2890; i += gasStops[i-1]) //initialize w fib sequence bc it gets harder as you go
			gasStop[counter] = i
			counter++; 
	}
	
	
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
	
	private distanceToNextStop()
	{
		int counter = 0;
		
	}
	
	public getSpeed()
	{
	}
	
	public setSpeed
	
	public double totalWeight()

	public void drive(int miles) 
	{
		if (forwardProgress <= 3000)
			distance/
		forwardProgress += miles;
		totalTime += speed * miles; 
		fuel -= (miles/mpg + passengers + cargo);	
		//TODO what if u run out of gas and lose
		refuel(fuelCapacity);
	}
	
	public void refuel(int maxGas)
	{
		int needGas = maxGas - currentGas;
		currentGas += needGas;
		money -= (2.75 * needGas); //dollar per gallon
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