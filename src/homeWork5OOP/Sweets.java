package homeWork5OOP;

/*Create parent abstract class Sweets*/
public abstract class Sweets {
	public String name;
	public int sugar;
	public int weight;
	public int price;

	public Sweets(String name, int sugar, int weight, int price) {
		this.name = name;
		this.sugar = sugar;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return " Sweets [name= " + name + ", sugar=" + sugar + ", weight=" + weight + ", price=" + price + "]";
	}
}
