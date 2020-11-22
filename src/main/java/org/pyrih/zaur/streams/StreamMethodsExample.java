package org.pyrih.zaur.streams;

import java.util.stream.Stream;

public class StreamMethodsExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);

        System.out.println("--------------------------");

        Stream<Integer> stream4 = Stream.of(6, 7, 8, 9, 0, 9, 7, 5);
        stream4.distinct().forEach(System.out::println);

        System.out.println("--------------------------");

        Stream<Integer> stream5 = Stream.of(6, 7, 8, 9, 0, 9, 7, 5);
        System.out.println("Count: " + stream5.count());

        Stream<Integer> stream6 = Stream.of(6, 7, 8, 9, 0, 9, 7, 5);
        System.out.println("Count distinct: " + stream6.distinct().count());

        System.out.println("--------------------------");

        Stream<Integer> stream7 = Stream.of(6, 7, 8, 9, 0, 9, 7, 5);
        System.out.println("Counted distinct: " +
                stream7.distinct().peek(System.out::println).count()
        );

        System.out.println("--------------------------");



    }
}
