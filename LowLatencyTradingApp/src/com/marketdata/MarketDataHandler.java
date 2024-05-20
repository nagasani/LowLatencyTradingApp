package com.marketdata;

import org.zeromq.ZMQ;

public class MarketDataHandler {
    private ZMQ.Context context;
    private ZMQ.Socket subscriber;

    public MarketDataHandler(String endpoint) {
        context = ZMQ.context(1);
        subscriber = context.socket(ZMQ.SUB);
        subscriber.connect(endpoint);
        subscriber.subscribe("".getBytes());
    }

    public void start() {
        while (!Thread.currentThread().isInterrupted()) {
            String message = subscriber.recvStr();
            processMarketData(message);
        }
    }

    private void processMarketData(String data) {
        // Process market data
    }

    public void close() {
        subscriber.close();
        context.close();
    }
}
