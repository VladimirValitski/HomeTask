package homeWork7CashBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/*Create class Buyer witch implements Runnable */
public class Buyer implements Runnable {
	String name;
	CashBox[] cashBox;
	String[] foods;
	BlockingQueue<CashBox> queue;

	Buyer(BlockingQueue<CashBox> queue, String name, String[] foods, CashBox[] cashBox) {
		this.queue = queue;
		this.name = name;
		this.foods = foods;
		this.cashBox = cashBox;
	}

	/*
	 * 
	 * check CashBoxs for the presence of threads if the CashBox has a tread, go
	 * to the next CashBox if the CashBox is full, clear its
	 */
	public void run() {
		for (int i = 0; i < cashBox.length; i++) {
			try {
				for (int j = 0; j < cashBox.length - 1; j++) {
					if (queue.contains(cashBox[i])) {
						i++;
					}
				}
				if (queue.size() == cashBox.length) {
					queue.clear();
				}
				queue.add(cashBox[i]);
				System.out.println(cashBox[i].buyProducts(this));
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String choiceProducts() {// method who choice products from market
		List<String> shopingBasket = new ArrayList<>();
		Random random = new Random();
		int n = random.nextInt(12);// get product by random
		shopingBasket.add(foods[n]);//full shopingBasket by foods
		return shopingBasket.toString();
	}
}
