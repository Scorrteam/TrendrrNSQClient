package com.trendrr.nsq;

import org.junit.Test;

/**
 * @since 3/22/15.
 */
public class CloseDeadlockTest {
    @Test
    public void deadlock() {
        NSQProducer producer = new NSQProducer();
        producer.addAddress("localhost", 4150, 1);
        producer.start();
        producer.close();
    }
}
