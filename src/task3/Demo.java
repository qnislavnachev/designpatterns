package task3;

import task3.item.OrderItem;
import task3.item.OrderItemBuilder;
import task3.order.Order;
import task3.order.OrderBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<OrderItem> list = new ArrayList<>();
        OrderItemBuilder itemBuilder = new OrderItemBuilder();
        OrderBuilder orderBuilder = new OrderBuilder();

        OrderItem item1 = itemBuilder.build("Bread", "piece", 40, 1);
        OrderItem item2 = itemBuilder.build("Tomato", "kg", 40, 1.60);
        list.add(item1);
        list.add(item2);
        Order order = orderBuilder.build("name", "addres", new Date(), new Date(), list);
        OrderItem item5 = order.getItems().get(1);
        System.out.println(item5.getPrice());
    }
}
