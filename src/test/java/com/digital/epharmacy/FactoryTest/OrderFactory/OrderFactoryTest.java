package com.digital.epharmacy.FactoryTest.OrderFactory;
//Matthew Pearce - Test to create new order - 05 July
import com.digital.epharmacy.entity.Order.Order;
import com.digital.epharmacy.factory.Order.OrderFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFactoryTest {

    @Test
    public void createOrder() {

        Order order = OrderFactory.createOrder("Random",10.00, 10, "EFT");

<<<<<<< HEAD
<<<<<<< HEAD
        String orderNumber = order.getOrderNumber();

        assertEquals("Random", order.getUserID());
        assertEquals(orderNumber ,order.getOrderNumber());
        assertEquals(10.00,order.getOrderTotal(),0);
        assertEquals(10,order.getTotalCatalogueItems());
        assertEquals("EFT",order.getPaymentType());
        assertEquals("30-8-2020",order.getDate());
=======
=======
        String orderNumber = order.getOrderNumber();

>>>>>>> upstream/groupCollaboration
        assertEquals("Random", order.getUserID());
        assertEquals(orderNumber ,order.getOrderNumber());
        assertEquals(10.00,order.getOrderTotal(),0);
        assertEquals(10,order.getTotalCatalogueItems());
        assertEquals("EFT",order.getPaymentType());
<<<<<<< HEAD
        assertEquals("2020-20-50",order.getDate());
>>>>>>> origin/groupCollaboration
=======
        assertEquals("30-8-2020",order.getDate());
>>>>>>> upstream/groupCollaboration

    }


}