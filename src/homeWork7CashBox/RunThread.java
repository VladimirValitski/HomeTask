package homeWork7CashBox;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * Напишите  программу, моделирующую кассы в магазине.
 * Существует  несколько  касс,  работающих  одновременно.  
 * Каждый  покупатель - отдельный поток.
 * Общее количество покупателей может быть больше чем количество касс, 
 * но одновременно не может обрабатываться больше покупателей чем имеется рабочих касс.
 *  У каждого покупателя есть набор товаров, которые должны быть выведены в процессе
 *  обслуживания.
 */
public class RunThread {

	public static void main(String[] args) {
		BlockingQueue<CashBox> queue = new ArrayBlockingQueue<CashBox>(4);
		ExecutorService es = Executors.newFixedThreadPool(2);
		CashBox[] cashBox = { new CashBox("CashBox1 "), new CashBox("CashBox2 "), new CashBox("CashBox3 "),
				new CashBox("CashBox4 ") };
		String[] foods = { "milk", "bananas", "sugar", "cakes", "nuts", "butter", "juice", "bread", "salt", "chocolate",
				"chees", "egs" };
		for (int i = 0; i < 10; i++) {
			es.execute(new Buyer(queue, "Buyer " + i, foods, cashBox));
		}
		es.shutdown();

	}

}
