package seventhSession;

public class CustomExceptionExample {
	public static void main(String[] args) {
		BankATM atm=new BankATM();
		atm.withdraw(700);
	}
}

class BankATM {
	public void withdraw(int amount){
		Account account=new Account(500);
		float balance;
		try {
			balance = account.withdraw(amount);
			System.out.println("Amount "+amount+" was deducted from your account "
					+ "\n Your account balance is "+balance);
		} catch (InsufficientBalanceException e) {
			System.out.println("Transaction Declined because of "+e);
		}
		
		
		
	}
}

class Account {
	float balance;

	public Account(float balance) {
		this.balance = balance;
	}

	public float withdraw(float amout) throws InsufficientBalanceException {
		if(amout>balance)
			throw new InsufficientBalanceException();
		balance -= amout;
		return balance;
	}

}
class InsufficientBalanceException extends Exception{
	String message="Insufficient Balance";
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}