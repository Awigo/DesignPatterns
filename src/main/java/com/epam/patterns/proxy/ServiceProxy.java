package com.epam.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Adam Awizen
 */
class ServiceProxy implements Service {

    private final Service service;
    private final Map<Integer, Long> responses = new HashMap<>();

    ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public long calculate(int i) {
        if (responses.containsKey(i)) {
            return responses.get(i);
        }
        long result = service.calculate(i);
        responses.put(i, result);
        return result;
    }
}
