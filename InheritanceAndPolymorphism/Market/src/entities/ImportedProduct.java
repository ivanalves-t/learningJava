package entities;

public class ImportedProduct extends Product {
	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + String.format(" (Customs fee: $ %.2f)", customFee);
	}
	
	public Double totalPrice() {
		return price + customFee;
	}
}
