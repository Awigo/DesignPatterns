package com.epam.patterns.strategy.maps;

/**
 * @author Adam Awizen
 */
class FlyStrategy implements Strategy {
    @Override
    public int calculateTime(int from, int to) {
        return (to - from) / 150;
    }
}
