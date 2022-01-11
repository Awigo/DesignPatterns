package com.epam.patterns.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceProxyTest {

    @Test
    void calculate() {
        ServiceProxy proxy = new ServiceProxy(new HeavyService());
        System.out.println(proxy.calculate(11));
        System.out.println(proxy.calculate(10));
        System.out.println(proxy.calculate(10));
        System.out.println(proxy.calculate(11));
    }
}