package eighthSession;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		//Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(3,"Jyoti");
		map.put(4,"Sai");
		map.put(2,"Avinash");
		map.put(5,"Soma");
		map.put(6,"Satish..");
		map.put(1, "Pankaj");
		
		System.out.println("Student with rollNo 2 is "+map.get(2));
		
		Set <Integer>rollNos=map.keySet();
		for (Integer rollNo : rollNos) {
			System.out.println("Roll No = "+rollNo+" => Name: "+map.get(rollNo) );
		}
		System.out.println("------------------------------------------------------------");
		Map <String, String>stringKeyValuePair=new TreeMap<String, String>();
		stringKeyValuePair.put("2","Name");
		stringKeyValuePair.put("A1","Address");
		stringKeyValuePair.put("4","Phone ");
		stringKeyValuePair.put("D6","Office");
		stringKeyValuePair.put("7","Home");
		
		Set <String>rollNosString=stringKeyValuePair.keySet();
		for (String rollNo : rollNosString) {
			System.out.println("Roll No = "+rollNo+" => Name: "+stringKeyValuePair.get(rollNo) );
		}
	}
}
