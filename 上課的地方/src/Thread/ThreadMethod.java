package Thread;

class MyThread extends Thread {
	MyThread() {
		start();
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(getName() + "執行緒:" + "執行第" + i + "次");
				sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ThreadMethod {
	public static void main(String[] args) {
		MyThread ObT1= new MyThread();
		ObT1.setName("T1");
		System.out.println("目前的執行緒為:"+Thread.currentThread().getName());
		System.out.println("執行緒T1是否活著:"+ObT1.isAlive());
		try {
			ObT1.join()
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
