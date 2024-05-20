package com.risk;

import order.Order;
import execution.Trade;

public class RiskManagement {
    public boolean preTradeCheck(Order order) {
        // Implement risk checks
        return true; // or false based on risk assessment
    }

    public void postTradeCheck(Trade trade) {
        // Implement post-trade risk assessment
    }
}
