package seventhSession;

public class ThrowsExample {
	public static void main(String[] args) {
		MyAPIForBlueRayDisk api=new MyAPIForBlueRayDisk();
		String result="";
		try {
			result = api.getContents();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		System.out.println(result);
	}
}

class MyAPIForBlueRayDisk{
	public String getContents() throws InterruptedException, ArithmeticException{
		int noOfSectors=0;
		int dataSize=40;
		
		String res="";
		Thread.sleep(10);
		int block=dataSize/noOfSectors;
		res="Contents of File";
		
		return res;
	}
}
