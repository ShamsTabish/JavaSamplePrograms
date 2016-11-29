
public class AccessSpecifierDemo {
	public static void main(String[] args) {
		Account account=new Account();
		System.out.println(account.getBalance());
		ATM atm=new ATM();
		atm.withdraw(account);
		System.out.println(account.getBalance());
	}
}

class Account{
	private int balance=1000;
	void withdraw(){
		balance=balance-400;
	}
	int getBalance(){
		return balance;
	}
}
class ATM{
	void withdraw(Account account){
		account.withdraw();
	}
}