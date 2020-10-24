package org.pyrih.us.basics;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://youtu.be/UIOG7QHYPec
 */

public class Demo {

    public static void main(String[] args) {

        // Lambdas
        Printer anonymousPrinter = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        anonymousPrinter.print("Hi from anonymous class!");
        System.out.println();

        Printer lambdaPrinter = message -> System.out.println(message);
        lambdaPrinter.print("Hi from lambda!");
        System.out.println();

        Printer methodReferencePrinter = System.out::println;
        methodReferencePrinter.print("Hi from method reference!");
        System.out.println();

        Map<String, Printer> printerHub = new HashMap<>();
        printerHub.put("lambda", lambdaPrinter);
        printerHub.put("formatted", msg -> {
            System.out.println("-=-=-");
            System.out.println(msg);
            System.out.println("-=-=-");
        });
        printerHub.get("lambda").print("Hello from lambda!");
        printerHub.get("formatted").print("Hello from formatted!");
        System.out.println();

        // Streams
        List<String> names = Arrays.asList("John", "James", "Steve", "Andrew");

        // 1
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        names.stream().forEach(s -> System.out.println(s));
        System.out.println();

        // 2
        for (String name : names) {
            if (name.startsWith("J")) {
                System.out.println(name);
            }
        }
        System.out.println();

        names
                .stream()
                .filter(s -> s.startsWith("J"))
                .forEach(s -> System.out.println(s));
        System.out.println();

        // 3
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("J")) {
                filteredNames.add(name);
            }
        }
        System.out.println(filteredNames);
        System.out.println();

        List<String> filteredNamesByStream = names.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
        System.out.println(filteredNamesByStream);
        System.out.println();

        // 4
        filteredNames.sort(String::compareToIgnoreCase);
        System.out.println(filteredNames);
        System.out.println();

        List<String> filteredSortedNamesByStream = names
                .stream()
                .filter(n -> n.startsWith("J"))
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
        System.out.println(filteredSortedNamesByStream);
        System.out.println();

        // 5
        printerHub.get("lambda").colorPrint("TEST");
        System.out.println();


    }
}
