package secondSession;

public class BreakExample {
	public static void main(String[] args) {
		int number = 1;
		for (;;) { // Infinite Loop

			if (number > 100)
				break;
			System.out.println("Number " + number++);
			System.out.println("Valid numbers..");
		}
		System.out.println("Program Terminated");
	}
}
