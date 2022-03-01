package Transcation;

public class Transcation {
	public static void main(String[] args) {
		Account account = new Account(5000);
		ATM A1 = new ATM(account, -1000);
		ATM A2 = new ATM(account, 2000);
		ATM A3 = new ATM(account, -9000);
		A1.start();
		A2.start();
		A3.start();
		try {
			A1.join();
			A2.join();
			A3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("最後帳戶餘額"+account.balance);
	}
	

}
