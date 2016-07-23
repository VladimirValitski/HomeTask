package homeWork4;

/*Create class Customer with elements: id,surname,name,econdName,adress,
 * numberCreditCard,numberBankCard*/
public class Customer {
	private int id;
	private String surname;
	private String name;
	private String secondName;
	private String adress;
	private int numberCreditCard;
	private int numberBankCard;

	public Customer() { // create constructor
	}

	public Customer(int id, String surname, String name, String secondname) {
		// create constructor1
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.secondName = secondname;

	}

	public Customer(int id, String surname, String name, String secondname, int numberCreditCard) {
		// create constructor2
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.secondName = secondname;
		this.numberCreditCard = numberCreditCard;

	}

	public Customer(int id, String surname, String name, String secondname, String adress, int numberCreditCard,
			int numberBankCard) {
		// create constructor3
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.secondName = secondname;
		this.adress = adress;
		this.numberCreditCard = numberCreditCard;
		this.numberBankCard = numberBankCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public int getNumberBankCard() {
		return numberBankCard;
	}

	public void setNumberBankCard(int numberBankCard) {
		this.numberBankCard = numberBankCard;
	}

	@Override
	public String toString() // create @Override for change method toString() ,
								// for understanding output strings
	{
		return "Customer{ id: " + id + " " + surname + " " + name + " " + secondName + ", adress: " + adress
				+ ", numberCreditCard: " + numberCreditCard + ", numberBankCard: " + numberBankCard + "}";

	}

}
