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
			switch (choose) {
			case ("1"):
				Locale localeEN = new Locale("en", "EN");
			ResourceBundle rbEN = ResourceBundle.getBundle("FILENAME", localeEN);
			Date currentDate = new Date();
			DateFormat dfEN = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeEN);			
			System.out.println(dfEN.format(currentDate));
			case ("2"):
				Locale localeRU = new Locale("ru", "RU");
				ResourceBundle rbRU = ResourceBundle.getBundle("FILENAME", localeRU);
				Date currentDateRU = new Date();
				DateFormat dfRU = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, localeRU);			
				System.out.println(dfRU.format(currentDateRU));
			}
			Locale currentLoc = Locale.getDefault();			
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
		Sweetmeats sweetmeatsOne = new Sweetmeats("Chupa-Chups", 14, 8, 2500);
		Sweetmeats sweetmeatsTwo = new Sweetmeats("Shock", 9, 7, 2750);
		Sweetmeats sweetmeatsThree = new Sweetmeats("SuperMeats", 8, 6, 2600);
		ChocoCandies chocoCandiesOne = new ChocoCandies("Mars", 15, 10, 3500);
		ChocoCandies chocoCandiesTwo = new ChocoCandies("Bounty", 13, 12, 3750);
		ChocoCandies chocoCandiesThree = new ChocoCandies("Twix", 18, 11, 3600);
		ChocoCandies chocoCandiesFour = new ChocoCandies("Snickers", 21, 13, 3900);
		ChocoCandies chocoCandiesFive = new ChocoCandies("Bueno", 10, 9, 4000);
		BubbleGum bubbleGumOne = new BubbleGum("Orbit", 4, 15, 5500);
		BubbleGum bubbleGumTwo = new BubbleGum("Love Is", 10, 5, 1500);
		BubbleGum bubbleGumThree = new BubbleGum("Turbo", 12, 6, 1300);
		BubbleGum bubbleGumFour = new BubbleGum("Stimorol", 17, 15, 4500);
		// create ArrayList<Sweets>
		ArrayList<Sweets> gift = new ArrayList<Sweets>();
		gift.addAll((Collection<? extends Sweets>) sweetmeatsOne); // add all sweets
		gift.addAll((Collection<? extends Sweets>) sweetmeatsTwo);
		gift.addAll((Collection<? extends Sweets>) sweetmeatsThree);
		gift.addAll((Collection<? extends Sweets>) chocoCandiesOne);
		gift.addAll((Collection<? extends Sweets>) chocoCandiesTwo);
		gift.addAll((Collection<? extends Sweets>) chocoCandiesThree);
		gift.addAll((Collection<? extends Sweets>) chocoCandiesFour);
		gift.addAll((Collection<? extends Sweets>) chocoCandiesFive);
		gift.addAll((Collection<? extends Sweets>) bubbleGumOne);
		gift.addAll((Collection<? extends Sweets>) bubbleGumTwo);
		gift.addAll((Collection<? extends Sweets>) bubbleGumThree);
		gift.addAll((Collection<? extends Sweets>) bubbleGumFour);
		return gift;
	}
}
