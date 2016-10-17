package task3.item;

public class OrderItemBuilder {
    private OrderItem item;

    public OrderItem build(String name, String measureUnit, double quantity, double price) {
        item = new OrderItem();
        item.setProductName(name);
        item.setMeasureUnit(measureUnit);
        item.setQuantity(quantity);
        item.setPrice(price);
        return item;
    }
}