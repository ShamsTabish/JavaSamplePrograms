package secondSession;

public class IfStatementDemo {

	public static void main(String[] args) {
		int marks=80;
		//boolean pass=marks >=40; 
		if(marks<40){
			System.out.println("Unfortunately the student failed... :(");
			
		}else if(marks>=40 && marks <60)
		{
			System.out.println("The student scored 2nd Grade");
			
		}else if(marks >=60 && marks <75){
			System.out.println("Congratulations .. You scored first class..");
		}else  {
			System.out.println("Thats awesome!!! \n \t\t\t You scored DISTINCTION ... :)");
		}
		
		
		System.out.println("The calculation Completed!");
		
	}

}