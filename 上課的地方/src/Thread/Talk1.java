package Thread;

class ThreadB extends Thread {
	String str;
	int m;

	ThreadB(String a, int s) {
		str = a;
		m = s;

	}

	public void run() {
		try {
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
				sleep(m);
			}
		} catch (InterruptedException e) {
			System.out.println("產生例外......");
		}
	}
}

public class Talk1 {
	public static void main(String[] args) {
		String str1 = "HELLO WOLD";
		String str2 = "Java SE12";
		Thread obT1 = new ThreadB(str1, 200);
		Thread obT2 = new ThreadB(str2, 500);
		obT1.start();
		obT2.start();
	}

}
