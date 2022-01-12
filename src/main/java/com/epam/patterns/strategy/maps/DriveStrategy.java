package com.epam.patterns.strategy.maps;

/**
 * @author Adam Awizen
 */
class DriveStrategy implements Strategy {
    @Override
    public int calculateTime(int from, int to) {
        return (to - from) / 50;
    }
}
