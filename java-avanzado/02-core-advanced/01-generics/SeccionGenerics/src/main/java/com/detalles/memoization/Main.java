package com.detalles.memoization;

public class Main {

    public static void main(String[] args) {

        Memoizer<Integer, Long> factorialCache =
                new Memoizer<>(Main::factorial);

        System.out.println(factorialCache.compute(20));
        System.out.println(factorialCache.compute(20)); // cached
        System.out.println(factorialCache.compute(15));
    }

    private static long factorial(int n) {
        System.out.println("Calculating factorial of " + n);
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
