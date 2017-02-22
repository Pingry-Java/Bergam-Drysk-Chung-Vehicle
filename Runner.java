import java.util.Scanner; 

public class Runner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Welcome to On the Road. In this game, you'll be on a road trip across the country. You will be driving from gas stop to gas stop, earning points with the amount of cargo and passengers you can bring on the trip, as well as how much money you have left by the end of the game. But, if you carry too much and run out of gas in-between stops, you lose!"); 
		System.out.println("Please choose which vehicle you'd like to take on this trip (the vehicle used affects gas capacity, speed, passenger capacity, and cargo capacity): [CAR][TRUCK][MOTORCYCLE][BUS]"); d
	 
		String whichVehicle = keyboard.nextLine(); 
		
		Vehicle vehicle; 
		if ((whichVehicle.toUppercase).equals("BUS"))
			vehicle = new Bus(); 
		else if ((whichVehicle.toUppercase).equals("MOTORCYCLE"))
			vehicle = new Motorcycle(); 
		else if ((whichVehicle.toUppercase).equals("BUS"))
			vehicle = new Bus(); 
		else
			vehicle = new Car(); //polymorphism
		
	}
}