package quickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack {
	List<String> stack = new ArrayList<String>();
	int size = 5;
	@Override
	public String toString() {
		return stack.toString();
	}
	void push(String e) {
		if (size == stack.size())
			throw new IllegalStateException();
		else
			stack.add(e);
	}

	String pop() {
		if (stack.isEmpty())
			throw new NoSuchElementException();
		else {
			String e = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return e;
		}
	}
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push("h");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
