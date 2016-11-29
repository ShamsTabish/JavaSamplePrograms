package branching;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		String today = "Monday";

		System.out.print("Today is " + today + " and I'll study ");
		switch (today) {
		case "Monday":
			System.out.println("Java");
			break;
		case "Wednesday":
			System.out.println("Android");
			break;
		case "Thursday":
			System.out.println("Big Data");
			break;
		default:
			System.out.println("----");
			break;
		}
		;
		System.out.println("--End Of Program--");
	}
}
