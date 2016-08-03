package homeWork6;

/* Create class MyThreadSync*/
public class MyThreadSync extends Thread {

	private static Object obj = new Object();

	public MyThreadSync(String name) {
		super(name);
	}

	/**
	 * public void run() method print elements from 1 to 100
	 */
	public void run() {
		int n = 1;
		synchronized (obj) {
			for (int i = 1; i <= 10; i++) {
				try {
					// obj.wait();
					System.out.print(Thread.currentThread().getName() + ": ");
					// print name of current thread
					for (int j = 1; j <= 10; j++) {
						System.out.print((n++) + " ");
						// print nums for 10 elements
					}
					System.out.println();

					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// obj.notify();
		}
	}
}
