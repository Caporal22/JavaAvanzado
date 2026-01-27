package com.detalles.retry;

import java.util.function.Supplier;

public class RetryExecutor {

    private final int maxAttempts;
    private final long delayMillis;

    public RetryExecutor(int maxAttempts, long delayMillis) {
        this.maxAttempts = maxAttempts;
        this.delayMillis = delayMillis;
    }

    public <T> T execute(Supplier<T> action) {
        RuntimeException lastException = null;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                return action.get();
            } catch (RuntimeException e) {
                lastException = e;
                sleep();
            }
        }

        throw lastException;
    }

    private void sleep() {
        try {
            Thread.sleep(delayMillis);
        } catch (InterruptedException ignored) {
        }
    }
}
