
public class ClassDemo {
	
	public static void main(String[] args) {
		System.out.println("Start of Program..");
		Car maruti=new Car();
		maruti.move("Banglore");
	}
}

class Car{
	String color;
	String engineType=" autometic engine";
	
	static String manufacturer; 
	
	Car(){
		color="White";
		System.out.println("Constructor called...");
	}
	{
		System.out.println("Helloo..");
	}
	
	void move(String destination){
		int speed=20;
		System.out.println("Driving to "+destination+" using "+engineType);
	}
}