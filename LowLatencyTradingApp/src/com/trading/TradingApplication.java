package com.trading;

import marketdata.MarketDataHandler;
import order.Order;
import order.OrderManagementSystem;
import execution.ExecutionEngine;
import risk.RiskManagement;
import reporting.ReportingModule;

public class TradingApplication {
    public static void main(String[] args) {
        MarketDataHandler marketDataHandler = new MarketDataHandler("tcp://marketdatafeed:5555");
        OrderManagementSystem oms = new OrderManagementSystem();
        ExecutionEngine executionEngine = new ExecutionEngine(oms.getOrderBook());
        RiskManagement riskManagement = new RiskManagement();
        ReportingModule reportingModule = new ReportingModule();

        // Integrate components and start application
        marketDataHandler.start();
        // Example: Process orders
        Order order = new Order("order1", "BUY", 100, 50.5);
        if (riskManagement.preTradeCheck(order)) {
            oms.createOrder(order);
            executionEngine.executeOrder(order);
            reportingModule.logTrade(new Trade(order));
        }
    }
}
