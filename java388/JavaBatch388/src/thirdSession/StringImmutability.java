package thirdSession;

import java.util.Scanner;

public class StringImmutability {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = "Keith";
		name = "K";
		String lastName = "K";

		System.out.println("name =" + name);
		System.out.println("LastName =" + lastName);
		if (name == lastName) {
			System.out.println("Same   =");
		} else {
			System.out.println("Different    =");
		}

		name = scanner.nextLine();
		System.out.println("name =" + name);
		System.out.println("LastName =" + lastName);
		if (name == lastName) {
			System.out.println("Same  =");
		} else {
			System.out.println("Different  =");
		}

		if (name.equals(lastName)) {
			System.out.println("Same -equals");
		} else {
			System.out.println("Different -equals");
		}

	}
}
