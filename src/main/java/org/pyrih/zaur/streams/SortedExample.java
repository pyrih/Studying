package org.pyrih.zaur.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedExample {
    public static void main(String[] args) {
        int[] ints = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        IntStream limit = IntStream.range(1, 101).limit(20);

        int[] array = Arrays.stream(ints)
                .sorted().toArray();
        System.out.println(Arrays.toString(array));

        int[] toArray = limit.sorted().toArray();
        System.out.println(Arrays.toString(toArray));

        // also see FilterExample sorted() operation with lambda comparator


        // operation chaining
        int asInt = Arrays.stream(ints)
                .filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0)
                        e = e / 3;
                    return e;
                })
                .reduce(Integer::sum) // .reduce((a, e) -> a + e)
                .getAsInt();
        System.out.println(asInt);
    }
}
