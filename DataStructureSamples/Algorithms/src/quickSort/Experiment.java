package quickSort;

import java.util.Arrays;
import java.util.List;

public class Experiment {
	public static void main(String[] args) {
		int numbers[]={1,4,2,678,24,14,12};
		List lst=Arrays.asList(numbers);
		lst.stream().forEach(System.out::println);
	}
	int mapper(int n){
		System.out.println(n);
		return n;
	}
}
