package org.pyrih.zaur.streams;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] values = {7, 13, 19, 93, 2};

        Arrays.stream(values)
                .forEach(value -> {
                    value *= 2;
                    System.out.println(value);
                });

        Arrays.stream(values)
                .forEach(System.out::println);

        Arrays.stream(values)
                .forEach(Utils::m);
    }
}

class Utils {
    public static void m(int a) {
        a = a + 5;
        System.out.println("Element: " + a);
    }
}
