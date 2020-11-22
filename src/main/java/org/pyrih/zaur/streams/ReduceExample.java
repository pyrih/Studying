package org.pyrih.zaur.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        Integer integer = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get(); // It needs to use ifPresent() and than get() or orElse() method.
        // 5, 8, 2, 4, 3
        // accumulator 5  40  80  320  960
        // element     8   2   4   3
        System.out.println(integer);


        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(8);
        list2.add(2);
        list2.add(4);
        list2.add(3);

        Integer integer2 = list2.stream()
                .reduce(1, (accumulator, element) -> accumulator * element);
        // accumulator 1  5  40  80  320  960
        // element     5  8   2   4   3
        System.out.println(integer2);


        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        String s = strings.stream()
                .reduce((a, b) -> a + " " + b)
                .get();
        System.out.println(s);

        String s2 = strings.stream()
                .reduce("Y",  (a, b) -> a + "" + b);
        System.out.println(s2);
    }
}
