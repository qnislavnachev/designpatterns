package builder.orderitem;

public class OrderItemBuilder {
    private String productName;
    private String measureUnit;
    private Double quantity;
    private Double price;

    public OrderItemBuilder(String productName, Double quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderItemBuilder buildMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    public OrderItemBuilder buildPrice(Double price) {
        this.price = price;
        return this;
    }

    public OrderItem build() {
        return new OrderItem(this);
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
