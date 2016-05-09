package fifthSession.inheritance;
class Mathematics{
	int add(int no1, int no2){
		System.out.println("Mathod with 2 params called");
		return no1+no2;
	}
	int add(int no1, int no2, int no3){
		System.out.println("Mathod with 3 params called");
		return no1+no2+no3;
	}

}
public class OverLoadingExample {

	public static void main(String[] args) {
		Mathematics maths=new Mathematics();
		int result =maths.add(2, 6);
		System.out.println("The Result is "+result);

	}

}
