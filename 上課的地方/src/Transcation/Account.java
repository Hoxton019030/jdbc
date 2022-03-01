package Transcation;

public class Account {
	long balance;

	public Account(long balance) {
		this.balance = balance;
	}

	public synchronized void deposit(long amount) {
		long d_balance;
		d_balance = this.balance;
		System.out.println("帳戶內餘額=" + d_balance);
		if (amount >= 0)
			System.out.println("存款增加數 =" + d_balance);
		else
			System.out.println("存款減少數=" + amount);
		System.out.println("交易中......");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d_balance += amount;
		if (d_balance >= 0) {
			System.out.println("目前帳戶餘額 =" + d_balance + "\n");
			this.balance = d_balance;

		} else {
			System.out.println("帳戶餘額不足! \n");
		}

	}

}
