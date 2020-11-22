package org.pyrih.zaur.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("ABC");
        strings.add("ABCD");
        strings.add("ABCDE");
        strings.add("ABCDEF");
        strings.add("ABCDEFG");
        strings.add("BCDEFG");
        strings.add("CDEFG");
        strings.add("DEFG");
        strings.add("EFG");

        Predicate<String> lessThanPredicate = s -> s.length() < 5;
        Predicate<String> moreThanPredicate = s -> s.length() > 3;
        Predicate<String> startWithPredicate = s -> s.startsWith("ABC");

        check(strings, moreThanPredicate);
        System.out.println();
        check(strings, moreThanPredicate.and(startWithPredicate));
        System.out.println();
        check(strings, moreThanPredicate.or(lessThanPredicate));
        System.out.println();
        check(strings, startWithPredicate.negate());
        System.out.println();

        strings.removeIf(s -> s.endsWith("EFG"));
        System.out.println(strings.toString());
    }

    public static void check(List<String> strings, Predicate<String> predicate) {
        for (String string : strings) {
            if (predicate.test(string)) {
                System.out.println(string);
            }
        }
    }
}
