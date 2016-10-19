package builder.order;

import builder.orderitem.OrderItem;
import java.util.Date;
import java.util.List;

public class Order {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate;
    private Date orderDeliveryDate;
    private List<OrderItem> items;

    public Order(OrderBuilder builder) {
        this.orderId = builder.getOrderId();
        this.customerName = builder.getCustomerName();
        this.customerAddress = builder.getCustomerAddress();
        this.orderCreationDate = builder.getOrderCreationDate();
        this.orderDeliveryDate = builder.getOrderDeliveryDate();
        this.items = builder.getItems();
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}