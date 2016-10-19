package builder.order;

import builder.orderitem.OrderItem;

import java.util.Date;
import java.util.List;

public class OrderBuilder {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate;
    private Date orderDeliveryDate;
    private List<OrderItem> items;

    public OrderBuilder(String customerName, List<OrderItem> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public OrderBuilder buildOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder buildCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public OrderBuilder buildCreationDate(Date orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
        return this;
    }

    public OrderBuilder buildDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
        return this;
    }

    public Order build(){
        return new Order(this);
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