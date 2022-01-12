package com.epam.patterns.strategy.payment;

/**
 * @author Adam Awizen
 */
class PayingContext  {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    boolean pay(int amount) {
        return payStrategy.pay(amount);
    }
}
