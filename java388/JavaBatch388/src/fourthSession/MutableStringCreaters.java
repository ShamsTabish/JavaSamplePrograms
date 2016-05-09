package fourthSession;

public class MutableStringCreaters {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder=new StringBuilder();// Not thread safe but efficient
		stringBuilder.append("This ");
		stringBuilder.append("is ");
		stringBuilder.append("Forth ");
		stringBuilder.append("session using Builder");
		System.out.println(stringBuilder.toString());
		
		
		StringBuffer stringBuffer=new StringBuffer();//Thread safe but inefficient
		stringBuffer.append("This ");
		stringBuffer.append("is ");
		stringBuffer.append("Forth ");
		stringBuffer.append("session using Buffer");
		System.out.println(stringBuffer.toString());
		
		
		
	}
}
