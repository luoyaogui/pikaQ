package com.baidu.pikaq.origin.common;

/**
 * Gateway interface that sends trades to an external process.
 */
public interface OrderServiceGateway {

    void send(TradeRequest tradeRequest);

}
