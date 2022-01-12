package com.epam.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    void testFactory() {
        Factory factory = new IceCreamFactory();
        Product iceCream = factory.createProduct();
        Assertions.assertTrue(iceCream instanceof IceCream);

        factory = new PizzaFactory();
        Product pizza = factory.createProduct();
        Assertions.assertTrue(pizza instanceof Pizza);
    }
}