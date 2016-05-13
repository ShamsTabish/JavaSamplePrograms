package sixthSession;

public class AbstractExample {

	public static void main(String[] args) {
		boolean isRouteInOcean=false;
		Vehicle vehicle;
		
		if(isRouteInOcean)
			vehicle=new Ship();
		else
			vehicle=new Car();
		
		
		vehicle.transport();
		
		System.out.println(" Chassis type is "+vehicle.getChassis());
		
	}
	
}

class Car extends Vehicle {
	public Car(){
		chassis="Steel Made, fiber protected Chassis...";
	}
	@Override
	public void transport() {
		System.out.println("Transporting using car's engine and 4 wheels.");
	}
	
}

class Ship extends Vehicle{

	@Override
	public void transport() {
		System.out.println("Transpoting using ship in the ocean..");
		
	}
	
}

abstract class Vehicle{
	String chassis="Unknown - madeup of Metal";
	abstract public void transport();
	public String getChassis(){
		return chassis;
	}
}