package com.reporting;

import execution.Trade;
import java.util.ArrayList;
import java.util.List;

public class ReportingModule {
    private List<Trade> tradeHistory = new ArrayList<>();

    public void logTrade(Trade trade) {
        tradeHistory.add(trade);
        // Generate real-time reports if needed
    }

    public void generateEndOfDayReport() {
        // Generate and store end-of-day reports
    }
}
