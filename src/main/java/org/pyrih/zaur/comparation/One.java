package org.pyrih.zaur.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Zaur");
        strings.add("Ivan");
        strings.add("Mary");

        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
    }
}
