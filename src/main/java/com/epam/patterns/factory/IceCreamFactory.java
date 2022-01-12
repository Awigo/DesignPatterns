package com.epam.patterns.factory;

/**
 * @author Adam Awizen
 */
class IceCreamFactory extends Factory {
    @Override
    void someOperation() {
        
    }

    @Override
    Product createProduct() {
        return new IceCream();
    }
}
