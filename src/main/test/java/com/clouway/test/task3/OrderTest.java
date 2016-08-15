package com.clouway.test.task3;

import com.clouway.task3.item.builder.ItemDirector;
import com.clouway.task3.item.builder.OrderItem;
import com.clouway.task3.item.builder.OrderItemBuilder;
import com.clouway.task3.order.builder.CourierOrderBuilder;
import com.clouway.task3.order.builder.Order;
import com.clouway.task3.order.builder.OrderDirector;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderTest {

    private ItemDirector itemDirector = new ItemDirector(new OrderItemBuilder());
    private OrderDirector orderDirector = new OrderDirector(new CourierOrderBuilder());

    public boolean isOnTime(Order order, int daysToDeliver){
        int difference = (int)((order.getDeliveryDate().getTime() - order.getCreationDate().getTime())/86400000);
        if(difference <= daysToDeliver){
            return true;
        }else{
            return false;
        }
    }

    @Test
    public void orderDelivery(){
        List<OrderItem> items = new ArrayList();
        itemDirector.makeOrderItem("Vase","kg",3.0,15.60);
        items.add(itemDirector.getOrderItem());
        orderDirector.makeOrder(5663042100l,"Helga Kroos","Carl Franz №138", new Date(2016,8,6), new Date(2016,8,8),items);
        assertTrue(isOnTime(orderDirector.getOrder(),6));
        orderDirector.makeOrder(5663042101l,"Annabelle Lot","Riverplate  №57", new Date(2016,8,6), new Date(2016,8,18),items);
        assertFalse(isOnTime(orderDirector.getOrder(),10));
    }

}
