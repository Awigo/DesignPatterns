package com.epam.patterns.factory;

/**
 * @author Adam Awizen
 */
class PizzaFactory extends Factory {
    @Override
    void someOperation() {
        super.someOperation();
    }

    @Override
    Product createProduct() {
        return new Pizza();
    }
}
