package com.epam.patterns.strategy.payment;

/**
 * @author Adam Awizen
 */
interface PayStrategy {
    boolean pay(int amount);
}
