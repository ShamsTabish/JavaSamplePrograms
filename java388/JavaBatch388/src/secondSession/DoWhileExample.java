package secondSession;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner inputTaker=new Scanner(System.in);
		
		int tableFor=inputTaker.nextInt();
		
		int newValue=tableFor;
		do{
			System.out.println(newValue);
			newValue+=tableFor;//number=number + 2
		}while(newValue<=tableFor*10);
		
	}
}
