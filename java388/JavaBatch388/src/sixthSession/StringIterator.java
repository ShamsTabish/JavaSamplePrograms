package sixthSession;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Iterator;

public class StringIterator {

	public static void main(String[] args) {
		
		String institute="AcadGild, Bagalore";
		for (int i = 0; i < institute.length(); i++) {
			System.out.print(" "+institute.charAt(i));
		}
		
		
		int []array={3,4,6,8,894,3,2,46,8,998,5,5};
		
		for (int element:array) {
			System.out.println("Element "+element);
		}
		
		
	}

}
