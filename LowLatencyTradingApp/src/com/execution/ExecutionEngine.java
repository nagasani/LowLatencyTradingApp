package com.execution;

import order.OrderBook;

public class ExecutionEngine {
    private OrderBook orderBook;

    public ExecutionEngine(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    public void executeOrder(Order order) {
        // Matching logic and trade execution
    }
}
