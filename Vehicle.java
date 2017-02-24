public class Vehicle
{
	private static double fuelCapacity;
	private double fuel;
	
	private static int seats = 4;
	private static int wheels = 4; //override in smaller classes
	private static double cargoCapacity;
	private static double baseWeight = 1000;
	
	private double money;
	
	private int passengers;
	private double cargo;
	private int tires; //probability of blowing a tire
	private double forwardProgress;
	private double speed;
	private double totalTime = 0;
	private Engine engine;
	private static int[] gasStops;
	private static finishLine = 2890;
	
	//HERE: is a static initializer
	static {
		gasStops = new int[10];
		int counter = 0;
		for(int i = 1; i < 3000; i += gasStops[i-1]) 
			gasStop[counter] = i
			counter++; 
		//initialize w fib sequence bc it gets harder as you go
	}
	
	
	public Vehicle()
	{
		
	}
	
	private distanceToNextStop()
	{
	}
	
	public getSpeed()
	{
	}
	
	public setSpeed
	
	public double totalWeight()

	public void drive()
	{
		tires += 1;
	}
	
	public void drive(int miles) 
	{
		forwardProgress += miles;
		totalTime += speed * miles;
		fuel -= (miles/mpg + passengers + cargo);	
		//TODO what if u run out of gas and lose
		refuel(fuelCapacity);
		tires += 1;
	}
	
	public void refuel(int maxGas)
	{
		int needGas = maxGas - currentGas;
		currentGas += needGas;
		money -= (2.75 * needGas); //dollar per gallon
	}
}