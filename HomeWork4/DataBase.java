package homeWork4;

import java.util.Arrays;

public class DataBase {
	/* Creating customer databases */
	public static void main(String[] args) {
		Customer[] customer = addCustomer(); // create array customers

		System.out.println("Список покупателей в алфавитном порядке:");

		listAlphabet(customer);// sort customers by alphabet

		System.out.println(
				"Список покупателей, у которых номер кредитной карточки находится " + "в интервале(2000-3000):");
		listCreditCard(customer);// sort customers by CreditCard

	}

	private static Customer[] addCustomer() {
		Customer[] customer = new Customer[5];// create method for array
												// customers
		customer[0] = new Customer(1, "Valitski", "Vladimir", "Viktorovich", "Minsk,Kalinina 12", 2945, 3456);
		customer[1] = new Customer(2, "Tartega", "Vlad", "Viktorovich", "Minsk,Linina1", 3545, 3116);
		customer[2] = new Customer(3, "Farega", "Dmitri", "Karlovich", "Minsk,Lenina 23", 2224, 1567);
		customer[3] = new Customer(4, "Dega", "Alex", "Dmitrich", "Moscow,Lenina 45", 2001, 2007);
		customer[4] = new Customer(5, "Fers", "Mihail", "Egorovich", "Minsk,Esenina 32", 1004, 2001);
		return customer;
	}

	private static void listAlphabet(Customer[] customer) {
		Arrays.sort(customer, new SortedBySurname());

		for (Customer cust : customer) {
			System.out.println(cust);
		}
	}

	private static void listCreditCard(Customer[] customer) {// create method
																// for sort
																// customers by
																// CreditCard
		for (Customer cus : customer) {
			if ((cus.getNumberCreditCard() > 2000) && ((cus.getNumberCreditCard() < 3000))) {
				System.out.println(cus);
			}
		}

	}

}
