package builder.orderitem;

public class OrderItem {
    private String productName;
    private String measureUnit;
    private Double quantity;
    private Double price;

    public OrderItem(OrderItemBuilder builder) {
        this.productName = builder.getProductName();
        this.measureUnit = builder.getMeasureUnit();
        this.quantity = builder.getQuantity();
        this.price = builder.getPrice();
    }

    public String getProductName() {
        return productName;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}