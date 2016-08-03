package homeWork6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* class must provide a method to start unsynchronized output 
 * in the console window of numbers from 1 to 100 for 10 portions*/
public class TwoThread {
	public static void main(String[] args) throws InterruptedException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите слово *start* для запуска потоков: ");
		String word = reader.readLine();
		if (word.equals("start")) {// check input string for correctly word
			MyThread threadOne = new MyThread("Tread1");// create threads
			threadOne.start(); // start threads
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			MyThread threadTwo = new MyThread("Tread2");
			threadTwo.start();
		} else {
			System.out.println("Введено неверное слово. Попробуйте еще раз.");
			System.exit(0);
		}

	}
}
