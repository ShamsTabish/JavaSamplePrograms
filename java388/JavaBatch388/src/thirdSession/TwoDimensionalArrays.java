package thirdSession;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		String[][] timeTable={
									{"Monday","Tuesday","Wednesday"},
									{"Java",  "Java",   "Operating System"},
									{"Secrity","Android","Analytics"  }
							};
							// =new String[3][3];  // Another way of allocating memory to array
		
		for (int row = 0; row < timeTable.length; row++) {
			for (int column = 0; column < timeTable.length; column++) {
				System.out.print("\t\t"+timeTable[row][column]);
			}
			System.out.println();
		}
		
		
	}
}
