
public class OverridingDemo {
	public static void main(String[] args) {
		boolean isSuperCarAvailable = false;
		MyVehicle petVicle;
		if (isSuperCarAvailable)
			petVicle = new MyCar();
		else
			petVicle = new MyVehicle();

		petVicle.drive();

	}
}

class MyVehicle {
	void drive() {
		System.out.println("Driving the vehicle");
	}
}

class MyCar extends MyVehicle {
	void drive() {
		System.out.println("Driving my Super Carr...");
	}

}
