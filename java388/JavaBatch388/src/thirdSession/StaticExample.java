package thirdSession;

public class StaticExample {
	public static void main(String[] args) {
		MyCar bmw=new MyCar();
		MyCar audi=new MyCar();
				
		bmw.setColor("Red");
		audi.setColor("Blue");
		
		System.out.println("BMW Color: "+bmw.getColor());
		System.out.println("Audi Color: "+audi.getColor());
		/*
		bmw.inventorOfMyCar="ABC";// Not a good way
		audi.inventorOfMyCar="XYZ";
		*/
		MyCar.inventorOfMyCar="ABC";
		MyCar.inventorOfMyCar="XYZ";
		
		
		System.out.println("Inventor BMW "+bmw.inventorOfMyCar);
		System.out.println("Inventor Audi "+audi.inventorOfMyCar);
		
		
		 System.out.println(MyCar.getCarGeneralDesign());
		 
	}

}


class MyCar{
	static String inventorOfMyCar;
	String color;

	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	static String getCarGeneralDesign(){
		
		return "A General Design..";
	}
	
}