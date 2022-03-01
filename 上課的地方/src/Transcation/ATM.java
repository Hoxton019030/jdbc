package Transcation;

class ATM extends Thread{
	Account account;
	long money;
	
	public ATM(Account ac, long n) {
		this.account =ac;
		this.money = n;
	}
	
	public void run() {
		account.deposit(money);
	}

}
