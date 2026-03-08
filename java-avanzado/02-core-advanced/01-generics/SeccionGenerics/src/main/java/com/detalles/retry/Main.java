package com.detalles.retry;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        RetryExecutor retry = new RetryExecutor(3, 500);

        String result = retry.execute(() -> unstableService());

        System.out.println("Result: " + result);
    }

    private static String unstableService() {
        if (new Random().nextBoolean()) {
            throw new RuntimeException("Temporary failure");
        }
        return "Success";
    }
}
