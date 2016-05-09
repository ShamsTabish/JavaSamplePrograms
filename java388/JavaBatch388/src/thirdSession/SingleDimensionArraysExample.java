package thirdSession;

import java.util.Arrays;

public class SingleDimensionArraysExample {
	public static void main(String[] args) {
		int[] employeeID = new int[10];
		int[] rollNumbers = { 31, 22, 83, 14, 5, 46, 17, 48, 79 };
						   // 0    1   2   3  4   5   6   7   8 -->> Indexes
		
		Arrays.sort(rollNumbers);
		
		
		System.out.println(rollNumbers[3]);
		rollNumbers[3]=34;
		System.out.println("The Student roll numbers are:");
		for (int i = 0; i < rollNumbers.length; i++) {
			System.out.println(rollNumbers[i]);
		}

		int index=Arrays.binarySearch(rollNumbers, 17);
		System.out.println("It is stored on index "+index);
		
	}
}