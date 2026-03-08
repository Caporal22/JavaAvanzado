package com.detalles.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Memoizer<T, R> {

    private final Map<T, R> cache = new HashMap<>();
    private final Function<T, R> function;

    public Memoizer(Function<T, R> function) {
        this.function = function;
    }

    public R compute(T input) {
        return cache.computeIfAbsent(input, function);
    }
}
