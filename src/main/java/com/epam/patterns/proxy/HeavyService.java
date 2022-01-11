package com.epam.patterns.proxy;

/**
 * @author Adam Awizen
 */
final class HeavyService implements Service {
    @Override
    public long calculate(int i) {
        long sum = 0;
        sleepFor(5000);
        for (int j = 0; j < i; j++) {
            sum += j;
        }
        return sum;
    }

    private void sleepFor(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
