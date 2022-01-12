package com.epam.patterns.strategy.maps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextTest {

    Context context = new Context();

    @Test
    void strategyTest() {
        context.setRouteStrategy(new FlyStrategy());
        int flyTime = context.executeStrategy(0, 1_000_000);
        Assertions.assertEquals(1_000_000 / 150, flyTime);

        context.setRouteStrategy(new DriveStrategy());
        int driveTime = context.executeStrategy(0, 1_000_000);
        Assertions.assertEquals(1_000_000 / 50, driveTime);

        context.setRouteStrategy(new WalkStrategy());
        int walkTime = context.executeStrategy(0, 1_000_000);
        Assertions.assertEquals(1_000_000 / 5, walkTime);
    }
}