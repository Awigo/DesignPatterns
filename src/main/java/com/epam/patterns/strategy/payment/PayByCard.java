package com.epam.patterns.strategy.payment;

/**
 * @author Adam Awizen
 */
class PayByCard implements PayStrategy {


    @Override
    public boolean pay(int amount) {
        System.out.println("Paying by card " + amount);
        return true;
    }

}
