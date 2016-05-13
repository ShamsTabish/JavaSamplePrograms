package eighthSession;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Pankaj");
		list.add("Avinash");
		list.add("Jyoti");
		list.add("Sai");
		list.add("Satish");

		
		list.add("Pankaj");
		list.add("Avinash K");
		list.add("JyotI");
		list.add("Sai S");
		list.add("Satish C");
		
		ListIterator<String> listIterator=list.listIterator();
				
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		System.out.println("------------------------End Of List ------------------------");
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
	}
}
