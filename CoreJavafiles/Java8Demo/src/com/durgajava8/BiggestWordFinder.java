package com.durgajava8;
import java.util.*;
import java.util.stream.*;

public class BiggestWordFinder {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java is fun");
        List<String> list2 = Arrays.asList("FlatMap is powerful");

        // Combine and flatten all words
        Optional<String> biggestWord = Stream.concat(list1.stream(), list2.stream()) 
            .flatMap(sentence -> Arrays.stream(sentence.split(" "))) 
            .max(Comparator.comparingInt(String::length)); 
        biggestWord.ifPresent(word -> System.out.println("Biggest word: " + word));
    }
}
