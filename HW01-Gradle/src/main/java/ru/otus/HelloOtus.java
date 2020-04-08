package ru.otus;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Collections;

/**
 * To start the application:
 * ./gradlew build
 * java -jar ./L01-gradle/build/libs/gradleHelloWorld-0.1.jar
 * <p>
 * To unzip the jar:
 * unzip -l L01-gradle.jar
 * unzip -l gradleHelloWorld-0.1.jar
 * <p>
 * To build:
 * ./gradlew build
 */
public class HelloOtus {
    public static void main(String... args) {
        String[] testData = {"Hello", "Otus", "Andrei", "Java", "Andrei"};
        Multiset<String> counts = HashMultiset.create();
        Collections.addAll(counts,
                           testData
                          );

        counts.entrySet().forEach(System.out::println);
    }
}
