package fifthSession.inheritance;

class Car{
	
	public void autoDrive(){
		System.out.println("Auto drive mode");
	}
}

class XUVCar extends Car{
	public void printXuvVersion(){
		System.out.println("XUV version 0023");
	}
	@Override
	public void autoDrive() {
		// TODO Auto-generated method stub
		super.autoDrive();
	}
}

class LuxuryCar extends Car{
	
	public void luxuryDrive(){
		System.out.println("Luxurious");
		super.autoDrive();
	}
	public void autoDrive(){
		System.out.println("Auto drive mode in Luxury Car");
	}
}


public class InheritanceExample {

	public static void main(String[] args) {
		Car car=new Car();
		car.autoDrive();
		
		
		XUVCar xuv=new XUVCar();
		xuv.autoDrive();//parent class method
		xuv.printXuvVersion();
		
		
		LuxuryCar xuvCar=new LuxuryCar();
		xuvCar.luxuryDrive();
	}

}
