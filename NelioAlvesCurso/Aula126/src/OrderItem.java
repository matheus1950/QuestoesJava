
public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem(Integer quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public Double subTotal() {
		return product.getPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	
}
