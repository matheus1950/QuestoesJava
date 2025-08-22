import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Client cliente = new Client();
		System.out.println("Enter client data:");
		System.out.println("Name:");
		cliente.setName(scan.nextLine());
		System.out.println("Email");
		cliente.setEmail(scan.nextLine());
		System.out.println("Birth date (DD/MM/YYYY)");
		try {
		    cliente.setBirthDate(LocalDate.parse(scan.nextLine(), formatter));
		} catch (DateTimeParseException e) {
		    System.out.println("Data inválida! Use o formato dd/MM/yyyy");
		}
		
		System.out.println("Enter order data:");
		Order o1 = new Order(cliente);
		System.out.println("Status:");
		o1.setStatus(OrderStatus.PROCESSING);
		System.out.println("How many items tho this order?");
		int n = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {
		    System.out.println("Enter #" + (i + 1) + " item data:");
		    
		    Product product = new Product(); // Criar novo produto a cada item
		    
		    System.out.println("Product name: ");
		    product.setName(scan.nextLine());
		    
		    System.out.println("Product price: ");
		    product.setPrice(scan.nextDouble());
		    scan.nextLine();
		    
		    System.out.println("Quantity: ");
		    int quantity = scan.nextInt();
		    scan.nextLine();
		    
		    o1.addItem(new OrderItem(quantity, product));
		}
		
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + o1.getMoment());
		System.out.println("Order status: " + o1.getStatus());
		System.out.println("Client: " + o1.getClient().getName() + " (" + o1.getClient().getBirthDate() + 
				") - " + cliente.getEmail());
		System.out.println("Order items: ");
		o1.orderInfo();
		System.out.println("Total price: " + o1.total());
	}

}
