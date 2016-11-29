//import myPackage.*;
//import myPackage.PackageDemo;;
public class PackageDemoCaller {
	public static void main(String[] args) {
		//PackageDemo demo=new PackageDemo();
		myPackage.PackageDemo demo=new myPackage.PackageDemo();
		demo.printDemo();
	}
}
