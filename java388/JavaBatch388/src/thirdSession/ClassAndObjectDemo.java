package thirdSession;

public class ClassAndObjectDemo {

	public static void main(String[] args) {
	Car maruti=new Car("White","HighPower", "Maruti Esteem"," ..");
	
	maruti.move();
	
	Car bmw=new Car("Red","Japanise..","Luxurious BMW", "AC, Auto Drive etc..");
	bmw.setEngine("Indian Engine");
	
	bmw.move();
	String features=bmw.listPropertiesOfThisCar();
	
	System.out.println("Features: "+features);
	
	
	Car someCar=new Car("1","2");
	someCar.move();
	
		
	}

}

class Car{
	static String inventor;
	
	private String color;
	private String engine;
	private String modelAndComapy;
	private String moreFeatures;
	
	public Car(){
		color="Gray";
		engine="Some Old Engine";
		modelAndComapy="Unknown Car";
		moreFeatures="";
	}
	
	public Car(String color, String engine){
		this.color=color;
		this.engine=engine;
		modelAndComapy="Unknown Car";
		moreFeatures="";
	}
	
	public Car(String c,String eng,String eAndC,String mF){
		color=c;
		engine=eng;
		modelAndComapy=eAndC;
		moreFeatures=mF;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		if(!engine.equals("Made In Nepal"))
			this.engine = engine;
	}

	public String getModelAndComapy() {
		return modelAndComapy;
	}

	public void setModelAndComapy(String modelAndComapy) {
		this.modelAndComapy = modelAndComapy;
	}

	public String getMoreFeatures() {
		return moreFeatures;
	}

	public void setMoreFeatures(String moreFeatures) {
		this.moreFeatures = moreFeatures;
	}

	
	
	void move(){
		System.out.println("Using Engine "+engine+" to move the "+modelAndComapy);
	}
	
	public String listPropertiesOfThisCar(){
		
		return color+" - "+engine+" - "+modelAndComapy+" - "+ moreFeatures;
	}
	
}
