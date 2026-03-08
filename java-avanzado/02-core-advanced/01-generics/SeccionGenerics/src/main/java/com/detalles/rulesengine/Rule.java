package com.detalles.rulesengine;

@FunctionalInterface
public interface Rule<T> {
    boolean evaluate(T context);
}
