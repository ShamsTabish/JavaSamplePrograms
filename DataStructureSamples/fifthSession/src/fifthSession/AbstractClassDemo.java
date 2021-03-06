package fifthSession;

public class AbstractClassDemo {
	public static void main(String[] args) {
		
		Vehicle vehicle=new MotorCycle();
		vehicle.move();
	}
}

abstract class Vehicle{
	
	String engine;
	abstract  void move();
	void startEngine(){
		System.out.println("Just use the key to start the Engine..");
	}
}

class Car extends Vehicle{
	void move(){
		startEngine();
		System.out.println("Moving the Car now..");
	}
}

class MotorCycle extends Vehicle{
	void move(){
		startEngine();
		System.out.println("Riding my bike very fast ");
	}
}