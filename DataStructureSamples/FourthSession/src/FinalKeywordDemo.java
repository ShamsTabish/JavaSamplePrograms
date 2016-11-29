
public class FinalKeywordDemo {
	public static void main(String[] args) {
		final int age=30;
		System.out.println("Age is "+age);
		
		Bicycle bike=new MountainBike();
		bike.ride();
	}
}
class Bicycle{
	final void ride(){
		System.out.println("Riding comfortably");
	}
}

final class MountainBike extends Bicycle {
//	void ride(){
//		System.out.println("Riding on the hills");
//	}
}
//
//class SomeCycle extends MountainBike{
//	
//}