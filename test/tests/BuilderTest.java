package tests;

import builder.order.Order;
import builder.orderitem.OrderItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BuilderTest {
    private Order order;
    private OrderItem item;

    @Before
    public void setUp() throws Exception {
        List<OrderItem> list = new ArrayList<>();
        item = new OrderItem.OrderItemBuilder().productName("product").price(10.00).build();
        list.add(item);
        Date creationDate = new Date(2016, 12, 5);
        Date deliveryDate = new Date(2016, 12, 10);
        order = new Order.OrderBuilder().customerName("name").items(list).creationDate(creationDate).deliveryDate(deliveryDate).build();
    }

    private boolean isOnTime(Order order, int days) {
        int diffInDays = (int) ((order.getOrderDeliveryDate().getTime() -
                order.getOrderCreationDate().getTime()) / (1000 * 60 * 60 * 24));
        if (diffInDays <= days) {
            return true;
        }
        return false;
    }

    @Test
    public void deliveryOnTime() throws Exception {
        assertTrue(isOnTime(order, 10));
    }
}