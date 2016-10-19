package builder.orderitem;

public class OrderItem {
    private String productName;
    private String measureUnit;
    private Double quantity;
    private Double price;

    public static class OrderItemBuilder{
        private String productName;
        private String measureUnit;
        private Double quantity;
        private Double price;

        public OrderItemBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public OrderItemBuilder measureUnit(String measureUnit) {
            this.measureUnit = measureUnit;
            return this;
        }

        public OrderItemBuilder quantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderItemBuilder price(Double price) {
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