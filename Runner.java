import java.util.Scanner; 

public class Runner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Welcome to On the Road. In this game, you'll be on a road trip across the country. You will be driving from gas stop to gas stop, earning points with the amount of cargo and passengers you can bring on the trip, as well as how much money you have left by the end of the game. But, if you carry too much and run out of gas in-between stops, you lose!"); 
		System.out.println("Please choose which vehicle you'd like to take on this trip (the vehicle used affects gas capacity, speed, passenger capacity, and cargo capacity): [CAR][TRUCK][MOTORCYCLE][BUS] (use all caps)"); 
		String whichVehicle = keyboard.nextLine(); 
		
		System.out.println("How many passengers would you like to carry?");
		int passengers = keyboard.nextInt(); 
		keyboard.nextLine(); 
		
		while ((whichVehicle.equals("MOTORCYCLE") && passengers > 2) || (whichVehicle.equals("CAR") && passengers > 5) || (whichVehicle.equals("TRUCK") && passengers > 8) || (whichVehicle.equals("BUS") && passengers > 50))
		{
			System.out.println("REMEMBER - Car: Max 5, Bus: Max 50, Motocycle: Max 2, Truck: Max 8. New entry: ");
			passengers = keyboard.nextInt();
			keyboard.nextLine();
		}
		
		
		Vehicle vehicle; 

		if (whichVehicle.equals("BUS"))
			vehicle = new Bus(passengers); 
		else if (whichVehicle.equals("MOTORCYCLE"))
			vehicle = new Motorcycle(passengers); 
		else if (whichVehicle.equals("TRUCK"))
			vehicle = new Truck(passengers); 
		else
			vehicle = new Car(passengers); //polymorphism
			
		
		System.out.println("From New Jersey, you will try and drive all the way to San Francisco");
		System.out.println("You have to spend money to ensure that your gas and tires are working.");
		System.out.println("You start out with $900. Gas costs 2.75 per gallon. And tires are 10 dollars.");
		vehicle.setMoney(900);
		vehicle.fillGas();
	
		int cargo;
		System.out.println("How much cargo are you carrying. It must be less than or equal to " + vehicle.getCargoCapacity() + " pounds");
		cargo = keyboard.nextInt();
		keyboard.nextLine(); 
		
		vehicle.setCargo(cargo); 
		
		while (!(vehicle.isStranded()) && !(vehicle.arrived()))
		{
			System.out.println("Type 'y' if you want to drive to the next gas station or type 'n' if you want to choose how far to drive: "); 
			if (keyboard.nextLine().equals("y"))
				vehicle.drive();  
			else
			{
				System.out.println("How far would you like to drive?"); 
				int distance = keyboard.nextInt(); 
				keyboard.nextLine(); 
				vehicle.drive(distance); 
			}
			
			System.out.println("You have " + vehicle.getMoney() + " dollars left.");
			System.out.println("You have " + vehicle.getFuel() + " gallons of fuel out of a maximum of " + vehicle.getFuelCapacity());
			System.out.println("You have travelled a total of " + vehicle.getForwardProgress() + " out of your 2890 mile journey.");
			
			System.out.println("Please type 'y' if you would like to buy fill your vehicle's gas tank or 'n' if you don't want to");
			if (keyboard.nextLine().equals("y"))
			{
				if (((vehicle.getFuelCapacity() - vehicle.getFuel()) * 2.75) > vehicle.getMoney())
				{
					System.out.println("You don't have enough money to fill your tank!");
					System.out.println("Type 'y' if you would you like to sell your cargo or 'n' if you don't want to");
					if (keyboard.nextLine().equals("y"))
						vehicle.sellCargo();
					
					if (((vehicle.getFuelCapacity() - vehicle.getFuel()) * 2.75) <= vehicle.getMoney())
						vehicle.fillGas();
				}
				
				System.out.println("Please type 'y' if you would like to purchase a tire for the journey or type 'n' if you don't want to"); 
				String next = keyboard.nextLine();
				if (next.equals("y"))
				{
					if (vehicle.getMoney() < 10)
						System.out.println("You don't have enough money to buy a tire!"); 
					else
						vehicle.buyTire();
				}
			}
			
		}
		if(vehicle.arrived())
			System.out.println("YOU WIN");
		else
			System.out.println("Fail");

	}
}