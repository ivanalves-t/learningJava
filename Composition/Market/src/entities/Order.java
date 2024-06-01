package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Client client;
	private Date moment;
	private OrderStatus orderStatus;
	
	private ArrayList <OrderItem> orderItems = new ArrayList <>();
	
	public Order (Date moment, OrderStatus orderStatus, Client client) {
		this.client = client;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}
	
	public void addItem (OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeItem (OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public Double total() {
		double sum = 0;
		
		for (OrderItem o : orderItems) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(orderStatus.name() + "\n");
		sb.append("Client: " + client.getName());
		sb.append('(' + sdf2.format(client.getBirthDate()) + ')');
		sb.append(" - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for (OrderItem o : orderItems) {
			sb.append(o.toString() + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}
}
