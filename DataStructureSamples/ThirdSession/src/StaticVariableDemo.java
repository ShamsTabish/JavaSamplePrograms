 import static java.lang.System.out; 
public class StaticVariableDemo {
	public static void main(String[] args) {
		BankAccount rajeshAccount=new BankAccount();
		//rajeshAccount.accountBalance+=3000;
		rajeshAccount.deposit(3000);
		rajeshAccount.deposit(500);
		
		BankAccount sandeepAccount=new BankAccount();
		sandeepAccount.deposit(1000);
		
		BankAccount maheshAccount=new BankAccount(); 
		maheshAccount.deposit(2000);
	//	System.out.println("Mahesh's Account"+maheshAccount.accountBalance);
		out.println("Bank balance "+BankAccount.bankBalance);
	}
	
	
	static {
	out.println("Helloo");
		
	}
}

class BankAccount {
	private float accountBalance;
	static float bankBalance;

	
	
	void deposit(float amount) {
		accountBalance += amount;
		bankBalance+=amount;
		
		out.println("\n\nMy Balance "+accountBalance);
		out.println("Bank Balance "+bankBalance);
		
		
	}

}