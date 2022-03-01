package Thread;

class GoldClass implements Runnable {
	int grabed;
	static int totalGold = 20000000;
	Thread t;

	GoldClass(String name) {
		grabed = 0;
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		while (grabGold() == true) {
			grabed++;
		}
		System.out.println(t.getName() + "總共偷得" + grabed + "個金塊.");

		// TODO Auto-generated method stub

	}

	private synchronized static boolean grabGold() {
		if (totalGold > 0) {
			totalGold--;
			return true;
		} else {
			return false;
		}
	}
}

public class NonSynchronizedDemo {
	public static void main(String[] args) {
		System.out.println("共有" + GoldClass.totalGold + "個金塊!");
		GoldClass tA = new GoldClass("張三");
		GoldClass tB = new GoldClass("李四");
		GoldClass tC = new GoldClass("王五");
	}

}
