package homeWork5OOP;

import homeWork5OOP.Sweets;

/**
 * public abstract class Sweets
 * 
 * @author user Create parent abstract class Sweets
 */
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
		return " Sweets [name= " + name + ", sugar=" + sugar + ", weight="
				+ weight + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + sugar;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweets other = (Sweets) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (sugar != other.sugar)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}
