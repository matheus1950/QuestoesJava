import java.util.ArrayList;
import java.util.Date;

public class Order {
	private Date moment;
	private OrderStatus status;
	private ArrayList<OrderItem> orders;
	private Client client;
	
	public Order(Client client) {
		super();
		this.moment = new Date();
		this.client = client;
		this.orders = new ArrayList<OrderItem>();
	}

	public void addItem(OrderItem item) {
		orders.add(item);
	}		
	
	public void removeItem(OrderItem item) {
		orders.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		for(OrderItem o : orders) {
			soma += o.subTotal();
		}
		return soma;
	}
	
	public void orderInfo() {
		for(OrderItem o : orders) {
			System.out.println(o.getProduct().getName() + ", " + o.getProduct().getPrice() + 
					", Quantity: " + o.getQuantity() + ", Subtotal: " +  o.subTotal());
		}
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public Client getClient() {
		return client;
	}

	
}
