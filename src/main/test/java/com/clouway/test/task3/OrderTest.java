package com.clouway.test.task3;

import com.clouway.task3.order.builder.OrderBuilder;
import com.clouway.task3.order.builder.Order;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderTest {

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
        Order firstOrder = new OrderBuilder().buildOrderCreationDate(new Date(2016,8,6)).buildOrderDeliveryDate(new Date(2016,8,8)).build();
        assertTrue(isOnTime(firstOrder,5));
        Order secondOrder = new OrderBuilder().buildOrderCreationDate(new Date(2016,8,6)).buildOrderDeliveryDate(new Date(2016,8,15)).build();
        assertFalse(isOnTime(secondOrder,5));
    }

}
