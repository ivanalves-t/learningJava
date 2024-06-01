package entities;

public class OrderItem {

	private Product product;
	private Integer quantity;
	private Double price;
	
	public OrderItem(Integer quantity, Product product) {
		this.product = product;
		this.price = product.getPrice();
		this.quantity = quantity;
	}
	
	public Double subTotal() {
		return quantity * price;
	} 
	
	public String toString () {
		return String.format(product.getProductName()) + ", $" + price + " Quantity: " + quantity +
				", Subtotal: $" + subTotal();
	}
}
