package homeWork6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* class must provide a method to start synchronized output 
 * in the console window of numbers from 1 to 100 for 10 portions*/
public class TwoThreadSync {
	public static void main(String[] args) throws InterruptedException, IOException {
		Object objOne = new Object();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Thread.currentThread().setName("Tread1"); // create threads
		MyThread threadTwo = new MyThread("Tread2");
		System.out.println("Введите слово *start* для запуска потоков: ");
		try {
			String word = reader.readLine();
			if (word.equals("start")) {// check input string for correctly word
				threadTwo.start(); // start threads
			} else {
				System.out.println("Введено неверное слово. Попробуйте еще раз.");
				System.exit(0);
			}
			int n = 1;
			synchronized (objOne) {
				for (int i = 1; i <= 10; i++) {
					// objOne.wait();
					System.out.print(Thread.currentThread().getName() + ": ");
					// print name of current thread
					for (int j = 1; j <= 10; j++) {
						System.out.print((n++) + " ");
						// print nums for 10 elements
					}
					System.out.println();
					Thread.sleep(200);
				}
				// objOne.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
