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
		for (int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName() + " ");
			for (int j = 0; j < 10; j++) {
				int n = (int) (Math.random() * 100);// create random elements
				System.out.print(" " + n);
			}
			System.out.println();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
