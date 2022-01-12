package com.epam.patterns.strategy.payment;

/**
 * @author Adam Awizen
 */
class PayByPayPal implements PayStrategy {

    @Override
    public boolean pay(int amount) {
        System.out.println("Paying by paypal " + amount);
        return true;
    }

}
