package eighthSession;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Set <String>set= new HashSet<String>();
		Set <String>set= new TreeSet<String>();
		set.add("Pankaj");
		set.add("Avinash");
		set.add("Jyoti");
		set.add("Sai");
		set.add("Satish");

		
		set.add("Pankaj");
		set.add("Avinash K");
		set.add("JyotI");
		set.add("Sai S");
		set.add("Satish C");
		
		set.remove("Pankaj");

		
		for (String name : set) {
			System.out.println(name);
		}
		
	}

}
