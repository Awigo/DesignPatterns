package com.epam.patterns.strategy.payment;

import org.junit.jupiter.api.Test;

class PayingContextTest {

    PayingContext context = new PayingContext();

    @Test
    void testPayStrategy() {
        context.setPayStrategy(new PayByCard());
        context.pay(100);

        context.setPayStrategy(new PayByPayPal());
        context.pay(100);
    }
}