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

    public static class OrderBuilder {
        private Long orderId;
        private String customerName;
        private String customerAddress;
        private Date orderCreationDate;
        private Date orderDeliveryDate;
        private List<OrderItem> items;


        public OrderBuilder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public OrderBuilder customerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public OrderBuilder creationDate(Date orderCreationDate) {
            this.orderCreationDate = orderCreationDate;
            return this;
        }

        public OrderBuilder deliveryDate(Date orderDeliveryDate) {
            this.orderDeliveryDate = orderDeliveryDate;
            return this;
        }

        public OrderBuilder items(List<OrderItem> items) {
            this.items = items;
            return this;
        }

        public Order build() {
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