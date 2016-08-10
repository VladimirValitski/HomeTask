package homeWork8Internat;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import homeWork8InternatLoc.BubbleGum;
import homeWork8InternatLoc.ChocoCandies;
import homeWork8InternatLoc.Sweetmeats;
import homeWork8InternatLoc.Sweets;

public class Main implements Serializable {
	private static final String FILENAME = "homeWork8Internat/resources/MessagesBundle";
	private static final long serialVersionUID = 1L;
	/* Новогодний подарок.Определить иерархию конфет и прочих сладостей. 
	Создать несколько объектов-конфет. 
	Собрать детский подарок с определением  его  веса. 
	 Провести  сортировку  конфет  в подарке  на основе  одного 
	из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Выберете локализацию/ Choose Locale - 1: en | 2: ru");
			String choose = reader.readLine();
//			switch (choose) {
//			case ("1"):
//				Locale localeEN = new Locale("en", "US");
//			ResourceBundle rbEN = ResourceBundle.getBundle(FILENAME, localeEN);
//			Date currentDate = new Date();
//			DateFormat dfEN = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeEN);			
//			System.out.println(dfEN.format(currentDate));
//			case ("2"):
//				Locale localeRU = new Locale("ru", "RU");
//				ResourceBundle rbRU = ResourceBundle.getBundle(FILENAME, localeRU);
//				Date currentDateRU = new Date();
//				DateFormat dfRU = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeRU);			
//				System.out.println(dfRU.format(currentDateRU));
//			}
			Locale currentLoc;
			if (choose.equals("2")){
				Locale localeRU = new Locale("ru", "RU");
				currentLoc = localeRU;
				ResourceBundle rbRU = ResourceBundle.getBundle(FILENAME, localeRU);
				Date currentDateRU = new Date();
				DateFormat dfRU = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeRU);
				System.out.println(dfRU.format(currentDateRU));
			}
			else {
				Locale localeEN = new Locale("en", "US");
				currentLoc = localeEN;
				ResourceBundle rbEN = ResourceBundle.getBundle(FILENAME, localeEN);
				Date currentDate = new Date();
				DateFormat dfEN = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeEN);
				System.out.println(dfEN.format(currentDate));
			}
						
			ArrayList<Sweets> gift = createGift();
			//create gift by ArrayList<Sweets>
			FileOutputStream fos = new FileOutputStream("gift.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(gift);
			oos.close();
//			System.out.println("Весс подарка (грам): ");
			displayValue(currentLoc,"s1" );
			findWeightGift(gift);
			System.out.println();
			// find weight of the gift
//			System.out.println("Список сладостей в подарке по диапазону содержания сахара (4-15 г): ");
			displayValue(currentLoc,"s2" );
			sortForSugar(gift);
			// sort Candies for sugar
			System.out.println();
//			System.out.println("Список сладостей по цене: ");
			displayValue(currentLoc,"s3" );
			sortForPrice(gift);
			// sort Candies for price
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	static void displayValue(Locale currentLocale, String key) {

		ResourceBundle resource = ResourceBundle.getBundle(FILENAME, currentLocale);
		String value = resource.getString(key);
		System.out.println(value);

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

	@SuppressWarnings("unchecked")
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
