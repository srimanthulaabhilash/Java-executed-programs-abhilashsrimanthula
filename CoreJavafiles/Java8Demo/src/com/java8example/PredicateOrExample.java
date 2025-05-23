package com.java8example;
import java.util.function.Predicate;

public class PredicateOrExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        Predicate<Integer> isGreatert10 = (num) -> num > 10;

        Predicate<Integer> isEvenOrGreaterThan10 = isEven.or(isGreatert10);
        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreatert10);

        System.out.println(isEvenOrGreaterThan10.test(12)); 
        System.out.println(isEvenAndGreaterThan10.test(11));
        
    }
}
