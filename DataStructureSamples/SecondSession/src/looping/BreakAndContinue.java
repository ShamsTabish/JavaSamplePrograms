package looping;

public class BreakAndContinue {
	public static void main(String[] args) {
		int number=0;
		while(true){
			System.out.println("Number= "+number);
			number++;
			if(number>3)
				break;
			//System.out.println("after Break");
		}
		System.out.println("----------");
		
		while(number>0){
			number--;
			if(number%2==0)
				continue;
			System.out.println("Number= "+number);
		}
		
	}
}