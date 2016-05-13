package sixthSession;

public class InterfaceExample {
	public static void main(String[] args) {
		DigitalDevice digitalDevice=new HardDiskDevice();
		digitalDevice.applyPowerSource();
		
		MechanicalDevice device=new HardDiskDevice();
		device.rotate();
	}
}


interface DigitalDevice{
	String deviceCategory="Digital Devices";
	void applyPowerSource();
}

interface MechanicalDevice{
	void rotate();
}

class HardDiskDevice implements DigitalDevice, MechanicalDevice {

	@Override
	public void applyPowerSource() {
		System.out.println("requires 12V for Operating the device");	
	}

	@Override
	public void rotate() {
		System.out.println("Rotation in clockwise direction with 500RPM ");
	}
	
}

