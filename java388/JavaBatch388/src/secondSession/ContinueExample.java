package secondSession;

public class ContinueExample {
	public static void main(String[] args) {
		int no=0;
		while(true){//Infinite Loop
			no++;
			
			if(no%2==1)
				continue;
			System.out.println(no);
			
			if(no>20)
				break;
			
		}
	}
}
