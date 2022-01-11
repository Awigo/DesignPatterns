package com.epam.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceCashingProxyTest {

    @Test
    void calculate() {
        ServiceCashingProxy proxy = new ServiceCashingProxy(new HeavyService());
        Assertions.assertEquals(55, proxy.calculate(11));
        Assertions.assertEquals(45, proxy.calculate(10));
        Assertions.assertEquals(45, proxy.calculate(10));
        Assertions.assertEquals(55, proxy.calculate(11));
    }
}