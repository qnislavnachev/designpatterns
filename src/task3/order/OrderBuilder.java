package task3.order;

import task3.item.OrderItem;

import java.util.Date;
import java.util.List;

public class OrderBuilder {
    private Order order;
    private long idCounter = 0;

    public Order build(String customerName, String customerAddress, Date creation, Date delivery, List<OrderItem> items) {
        idCounter++;
        order = new Order();
        order.setOrderId(idCounter);
        order.setCustomerName(customerName);
        order.setCustomerAddress(customerAddress);
        order.setOrderCreationDate(creation);
        order.setOrderDeliveryDate(delivery);
        order.setItems(items);
        return order;
    }
}