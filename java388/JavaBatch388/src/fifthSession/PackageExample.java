package fifthSession;

import fifthSession.utility.MathUtility;


//or
//import fifthSession.utility.*;


public class PackageExample {
	
	public static void main(String[] args) {
		//fifthSession.utility.MathUtility math=new fifthSession.utility.MathUtility();
		MathUtility math=new MathUtility();
		 float pi=math.getPIvalue();

		System.out.println("Value of PI as retrieved from utility package -> MathUtility class is "+pi);
	}

}
