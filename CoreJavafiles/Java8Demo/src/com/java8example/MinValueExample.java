package com.java8example;
import java.util.Arrays;
import java.util.OptionalInt;

public class MinValueExample {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 2};

        OptionalInt minValue = Arrays.stream(numbers).min();
        int min = minValue.orElseGet(() -> 0);

        System.out.println(min); // Output: 2
    }
}
