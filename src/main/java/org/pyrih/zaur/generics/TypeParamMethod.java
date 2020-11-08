package org.pyrih.zaur.generics;

import java.util.ArrayList;

public class TypeParamMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(5);
        Integer secondIntegerElement = Gen.getSecondElement(list1);
        System.out.println(secondIntegerElement);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        String secondStringElement = Gen.getSecondElement(list2);
        System.out.println(secondStringElement);
    }
}

class Gen {
    public static <T> T getSecondElement(ArrayList<T> first) { // нужно указывать <T> перед типов возвращаемого значения
        return first.get(1);
    }
}
