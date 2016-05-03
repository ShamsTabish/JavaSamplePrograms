package firstSession;

public class TypeCasting {

	public static void main(String[] args) {
		int integerNumber=25;
		float floatNumber=45.5f;
		
		//Explicit Type Cast
		integerNumber=(int)floatNumber;
				
		System.out.println("before int to float");

		System.out.println("FloatNumber is"+floatNumber);
		System.out.println("Integer Number is "+integerNumber);
		
		
		//Implicit Type Cast
		floatNumber=integerNumber;		
		
		
		System.out.println("After int to float");
		System.out.println("FloatNumber is"+floatNumber);
		System.out.println("Integer Number is "+integerNumber);

		
		
		

	}

}
