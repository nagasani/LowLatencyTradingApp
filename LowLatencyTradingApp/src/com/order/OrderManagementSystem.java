package com.order;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class OrderManagementSystem {
    private ConcurrentMap<String, Order> orderBook = new ConcurrentHashMap<>();

    public void createOrder(Order order) {
        orderBook.put(order.getId(), order);
        // Further processing
    }

    public void modifyOrder(String orderId, Order newOrder) {
        orderBook.put(orderId, newOrder);
        // Further processing
    }

    public void cancelOrder(String orderId) {
        orderBook.remove(orderId);
        // Further processing
    }
}
