package homeWork5OOP;

import homeWork5OOP.Sweets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main implements Serializable {
	private static final long serialVersionUID = 1L;
	/* Новогодний подарок.Определить иерархию конфет и прочих сладостей. 
	Создать несколько объектов-конфет111. 
	Собрать детский подарок с определением  его  веса. 
	 Провести  сортировку  конфет  в подарке  на основе  одного 
	из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			ArrayList<Sweets> gift = createGift();
			//create gift by ArrayList<Sweets>
			FileOutputStream fos = new FileOutputStream("gift.txt");//create serialized file gift.txt
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Sweets s : gift){
				oos.writeObject(s);}
			oos.close();
			System.out.print("Вес подарка (грамм): ");
			findWeightGift(gift);
			System.out.println();
			// find weight of the gift
			System.out.println("Список сладостей в подарке по диапазону содержания сахара (4-15 г): ");
			sortForSugar(gift);
			// sort Candies for sugar
			System.out.println();
			System.out.println("Список сладостей по цене: ");
			sortForPrice(gift);
			// sort Candies for price
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static void findWeightGift(ArrayList<Sweets> gift) {
		// find weight of the gift
		int weightGift = 0;
		for (Sweets s : gift) {
			weightGift += ((Sweets) s).getWeight();
		}
		System.out.println(weightGift);
	}

	private static void sortForPrice(ArrayList<Sweets> gift) {
		// sort Candies for price
		Collections.sort(gift, new Comparator<Sweets>() {
			public int compare(Sweets sweetsOne, Sweets sweetsTwo) {
			return sweetsOne.getPrice() - sweetsTwo.getPrice();
	}} );
		for (Sweets sw : gift) {
			System.out.println(sw);
		}
	}

	private static void sortForSugar(ArrayList<Sweets> gift) {
		// sort Candies for sugar
		for (Sweets s : gift) {
			if ((s.getSugar() > 2) && (s.getSugar() <= 10)) {
				System.out.println(s);
			}
		}
	}

	public static ArrayList<Sweets> createGift() {
		// create ArrayList of Sweets
		Sweets sweetmeatsOne = new Sweetmeats("Chupa-Chups", 14, 8, 2500);
		Sweets sweetmeatsTwo = new Sweetmeats("Shock", 9, 7, 2750);
		Sweets sweetmeatsThree = new Sweetmeats("SuperMeats", 8, 6, 2600);
		Sweets chocoCandiesOne = new ChocoCandies("Mars", 15, 10, 3500);
		Sweets chocoCandiesTwo = new ChocoCandies("Bounty", 13, 12, 3750);
		Sweets chocoCandiesThree = new ChocoCandies("Twix", 18, 11, 3600);
		Sweets chocoCandiesFour = new ChocoCandies("Snickers", 21, 13, 3900);
		Sweets chocoCandiesFive = new ChocoCandies("Bueno", 10, 9, 4000);
		Sweets bubbleGumOne = new BubbleGum("Orbit", 4, 15, 5500);
		Sweets bubbleGumTwo = new BubbleGum("Love Is", 10, 5, 1500);
		Sweets bubbleGumThree = new BubbleGum("Turbo", 12, 6, 1300);
		Sweets bubbleGumFour = new BubbleGum("Stimorol", 17, 15, 4500);
		// create ArrayList<Sweets>
		ArrayList<Sweets> gift = new ArrayList<Sweets>();
		gift.add(sweetmeatsOne); // add all sweets
		gift.add(sweetmeatsTwo);
		gift.add(sweetmeatsThree);
		gift.add(chocoCandiesOne);
		gift.add(chocoCandiesTwo);
		gift.add(chocoCandiesThree);
		gift.add(chocoCandiesFour);
		gift.add(chocoCandiesFive);
		gift.add(bubbleGumOne);
		gift.add(bubbleGumTwo);
		gift.add(bubbleGumThree);
		gift.add(bubbleGumFour);
		return gift;
	}
}
