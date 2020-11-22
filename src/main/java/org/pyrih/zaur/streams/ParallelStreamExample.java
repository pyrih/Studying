package org.pyrih.zaur.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        Stream<Double> doubleStream = Stream.of(0.33, 0.7, 1.0, 1.5, 2.1);

        Double aDouble = doubleStream.parallel().reduce(Double::sum).get();
        System.out.println("Sum result = " + aDouble);

        System.out.println("------------------------------------------");


    }
}
