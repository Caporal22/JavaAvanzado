package com.detalles.pipeline;

public interface Processor<T> {
    ProcessingResult process(T input);
}
