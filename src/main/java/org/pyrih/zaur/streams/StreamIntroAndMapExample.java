package org.pyrih.zaur.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntroAndMapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("nice");
        list.add("bye");

        List<Integer> integers = list.stream()
                .map(String::length) // .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(integers);

        int[] array = {5, 3, 9, 8, 1};
        int[] ints = Arrays.stream(array)
                .map(elem -> {
                    if (elem % 3 == 0)
                        elem = elem / 3;
                    return elem;
                })
                .toArray();
        System.out.println(Arrays.toString(ints));


        List<String> set = new ArrayList<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("nice");
        set.add("bye");

        Set<Integer> integerSet = set.stream()
                .map(e -> e.length())
                .collect(Collectors.toSet()); //TreeSet ?..
        System.out.println(integerSet);

        List<Integer> integerList = set.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
