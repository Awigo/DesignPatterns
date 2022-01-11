package com.epam.patterns.strategy;

/**
 * @author Adam Awizen
 */
class Context {
    private Strategy strategy;

    public void setRouteStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int from, int to) {
        return strategy.calculateTime(from, to);
    }
}
