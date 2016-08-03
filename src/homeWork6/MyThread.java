package homeWork6;

/* Create class MyThread*/
public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	/**
	 * public void run() method print elements from 1 to 100
	 */
	public void run() {
		int n = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() + ": ");
			// print name of current thread
			for (int j = 1; j <= 10; j++) {
				System.out.print((n++) + " ");// print nums for 10 elements
			}
			System.out.println();
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
