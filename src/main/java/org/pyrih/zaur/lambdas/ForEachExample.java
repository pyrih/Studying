package org.pyrih.zaur.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(s -> System.out.println(s));
        System.out.println();
        list.forEach(System.out::println);
    }
}
