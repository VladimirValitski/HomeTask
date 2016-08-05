package homeWork7CashBox;
/*Create class CashBox*/
public class CashBox {
	String name;

	CashBox(String name) {
		this.name = name;
	}

	public String buyProducts(Buyer buyer) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			if (i != 3)
				result.append(buyer.choiceProducts() + ", ");
			else
				result.append(buyer.choiceProducts());
		}
		return this.name + ": " + buyer.name + " bought products: " + result;//out result
	}
}
