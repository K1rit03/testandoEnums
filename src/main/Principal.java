package main;

import entities.enums.OrderStatus;
import entities_order.Order;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        var order = new Order(new Date(), 1080,OrderStatus.PENDING_PAYEMENTS);

        System.out.println(order);

        var  os1 =  OrderStatus.DELIVERED;

        var os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
