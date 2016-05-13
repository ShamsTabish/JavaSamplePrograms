package seventhSession;

import java.io.IOException;

public class ThrowKeywordExample {
	public static void main(String[] args) {
		APIForBuetooth api=new APIForBuetooth();
		try {
			String name=api.getDeviceName("208789767AC2");
			System.out.println("The device name is "+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured during reading the device name -->> "+e.getMessage());
		}
	}

}

class APIForBuetooth {
	public String getDeviceName(String deviceId) throws IOException {
		String name = "";
		boolean isBlutoothOn = true;

		// Chack for bluetooth status
		isBlutoothOn = false;
		if (!isBlutoothOn)
			throw new IOException("Bluetooth device is off");
		else
			name="International Bluetooth Device";

		return "";
	}
}